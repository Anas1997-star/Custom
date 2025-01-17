import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {
private int id;
private String name;
private int age;
public Employee() {
	super();
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", age=" + age + "]";
}
public Employee(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}
@Override
public int compareTo(Employee o) {
	if(o.age>age)
	return 1;
	else
		return -1;
}

}
public class Emp{
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee(101,"ahmed",24));
		al.add(new Employee(102,"shaik",23));
		al.add(new Employee(102,"anas",26));
		Collections.sort(al);
		for(Employee e:al) {
			System.out.println(e);
		}
	}
}


