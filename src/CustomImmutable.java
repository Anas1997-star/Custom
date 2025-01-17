
final class Immutable {
	private final int age ;
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public Immutable(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	private final String name;
}
public class CustomImmutable{
	public static void main(String[] args) {
		Immutable i=new Immutable(25, "shaik");

		System.out.println(i.getAge()+" "+i.getName());

	}
}