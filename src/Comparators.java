import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student implements Comparator<Student> {
	int id;
	String name;
	long marks;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	public Student() {
		super();
	}
	public Student(int id, String name, long marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
//	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
		
}
	
}


public class Comparators{
public static void main(String[] args) {
		List<Student> li=new ArrayList<>();{
			li.add(new Student(101,"shaik",98));
			li.add(new Student(102,"ahmed",99));
			li.add(new Student(103,"farraz",97));
			Collections.sort(li,new Student());
			Iterator<Student> it=li.iterator();
			while(it.hasNext())
			System.out.println(it.next());
	}
}
}