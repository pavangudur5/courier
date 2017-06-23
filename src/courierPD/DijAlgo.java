package courierPD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DijAlgo {
	
	private List<Intersection> intersection;
	private List<StreetSegment> StreetSegments;
	private Set<Intersection> Visited;
	private Set<Intersection> NotVisited;
	private Map<Intersection , Intersection> Predecessors;
	private Map<Intersection, Integer> distance;
	
	public DijAlgo(Graph graph)
	{
		this.intersection = new ArrayList<Intersection>(graph.getIntersection());
		this.StreetSegments = new ArrayList<StreetSegment>(graph.getEdges());
		
	}
	
	public void execute(Intersection Source) {
		Visited = new HashSet<Intersection>();
		NotVisited = new HashSet<Intersection>();
		distance = new HashMap<Intersection, Integer>();
		Predecessors = new HashMap<Intersection, Intersection>();
		distance.put(Source, 0);
		NotVisited.add(Source);
		while (NotVisited.size() > 0)
		{
			Intersection node = getMinimum(NotVisited);
			Visited.add(node);
			NotVisited.remove(node);
			findMinimalDistance(node);
		}
	}
	
	private void findMinimalDistance(Intersection node)
	{
		List<Intersection> adjacentNodes = getNeighbors(node);
		for(Intersection target : adjacentNodes){
			if(getShortestDistance(target) > getShortestDistance(node) + getDistance(node, target)) {
				distance.put(target, getShortestDistance(node) + getDistance(node, target));
				Predecessors.put(target, node);
				NotVisited.add(target);
			}
		}
	}
	
	private Intersection getMinimum(Set<Intersection> intersections)
	{
		Intersection minimum = null;
		for (Intersection intersection : intersections)
		{
			if(minimum == null)
			{
				minimum = intersection;
			}
			else
			{
				if (getShortestDistance(intersection) < getShortestDistance(minimum)){
					minimum = intersection;
				}
			}
		}
		return minimum;
	}
	
	private int getDistance(Intersection node, Intersection target)
	{
		for (StreetSegment sg : StreetSegments)
		{
			if(sg.getSource().equals(node) && sg.getDestination().equals(target)) {
				return sg.getWeight();
			}
		}
		throw new RuntimeException ("Error");
	}
	
	private List<Intersection> getNeighbors(Intersection node)
	{
		List<Intersection> neighbours = new ArrayList<Intersection>();
		for (StreetSegment sg : StreetSegments) {
			if (sg.getSource().equals(node) && !isSettled(sg.getDestination())) {
				neighbours.add(sg.getDestination());
			}
		}
		return neighbours;
	}
	
	private boolean isSettled(Intersection intersection)
	{
		return Visited.contains(intersection);
	}
	
	private int getShortestDistance(Intersection destination)
	{
		Integer d = distance.get(destination);
		if (d == null)
		{
			return Integer.MAX_VALUE;
		} else {
			return d;
		}
	}
	
	public LinkedList<Intersection> getPath(Intersection target) {
		LinkedList<Intersection> path = new LinkedList<Intersection>();
		Intersection step = target;
		if (Predecessors.get(step) == null)
			return null;
		path.add(step);
		while (Predecessors.get(step) != null)
		{
			step = Predecessors.get(step);
			path.add(step);
		}
		Collections.reverse(path);
		return path;
	}
}
