final class Immutable{
	private final int id;
	private final String name;
	@Override
	public String toString() {
		return "Immutable [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Immutable(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
public class CustomImmutable{
	public static void main(String[] args) {
		Immutable i=new Immutable(101, "shaik");
		System.out.println(i.getId()+" "+i.getName());
	}
}