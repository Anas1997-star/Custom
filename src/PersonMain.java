import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Person{
int id;
String name;
int age;
public Person(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}
public Person() {
	super();
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
}
}
public class PersonMain{
	public static void main(String[] args) {
		List<Person> li=new ArrayList<>();
		li.add(new Person(101,"shaik",25));
		li.add(new Person(102,"ahmed",23));
		li.add(new Person(103,"anas",24));
		li.stream().filter(s->s.age>23).collect(Collectors.toList()).forEach(n->System.out.println(n));
	
		
	}
}