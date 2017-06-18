package courierPD;

public class Intersection{
	
	private String id;
	private String name;
	
	public Intersection()
	{
		id = "";
		name = "";
	}
	
	public Intersection(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if(getClass() != obj.getClass())
			return false;
		Intersection other = (Intersection) obj;
		if(id == null)
		{
			if (other.id != null)
				return false;
		}
		else if(!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getName();
	}
	

}
