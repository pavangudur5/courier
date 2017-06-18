package courierPD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
//			Intersection node = getMinimum(NotVisited);
//			Visited.add(node);
//			NotVisited.remove(node);
//			findMinimalDistance(node);
		}
	}
	
	private void findMinimalDistance(Intersection node)
	{
		
	}
	
//	private Intersection getMinimum(Set<Intersection> intersections)
//	{
//		Intersection minimum = null;
//		for (Intersection intersection : intersections)
//		{
//			if(minimum == null)
//			{
//				minimum = intersection;
//			}
//			else
////			{
////				if (getShortestDistance(intersection) < getShortestDistance(minimum)){
////					minimum = intersetion;
//				}
//			}
//		}
	}
