package courierPD;

public class StreetSegment  {
	
	private String id;
	private Intersection source;
	private Intersection destination;
	private int weight;
	private String name;
	
	public StreetSegment()
	{
		id = "";
		source = new Intersection();
		destination = new Intersection();
		weight = 999;
		name = " ";
	}
	
	public StreetSegment(String id, Intersection source, Intersection destination, int weight) {
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.weight = weight;
		this.name = name;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Intersection getSource() {
		return this.source;
	}

	public void setSource(Intersection source) {
		this.source = source;
	}

	public Intersection getDestination() {
		return this.destination;
	}

	public void setDestination(Intersection destination) {
		this.destination = destination;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return   getId() + " " + getSource() + " " +  getDestination() + " " + getWeight();
	}
	
	
	
	
}
