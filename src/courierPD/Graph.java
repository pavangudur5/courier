package courierPD;

import java.util.List;

public class Graph {
	
	List <Intersection> Intersection;
	List <StreetSegment> streetSegments;
	
	public Graph(List<Intersection> Intersection, List<StreetSegment> streetSegments) {
		this.Intersection = Intersection;
		this.streetSegments = streetSegments;
	}

	public List<Intersection> getIntersection() {
		return this.Intersection;
	}

	public void setIntersection(List<Intersection> Intersection) {
		this.Intersection = Intersection;
	}

	public List<StreetSegment> getEdges() {
		return this.streetSegments;
	}

	public void setEdges(List<StreetSegment> streetSegments) {
		this.streetSegments = streetSegments;
	}
	
	

}
