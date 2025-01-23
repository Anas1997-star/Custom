import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SampleComparable implements Comparable<SampleComparable>{
int id ;
String name;
int age;

	@Override
public String toString() {
	return "SampleComparable [id=" + id + ", name=" + name + ", age=" + age + "]";
}

	public SampleComparable() {
	super();
}

	public SampleComparable(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}

	@Override
	public int compareTo(SampleComparable o) {
		// TODO Auto-generated method stub
		if(o.age>age) {
			return 1;
		}
		else
		return -1;
	}
	
}


public class Sample {
public static void main(String[] args) {
	List<SampleComparable> li=new ArrayList<>();
	li.add(new SampleComparable(101,"Venkat",23));
	li.add(new SampleComparable(102,"Ajay",21));
	li.add(new SampleComparable(102,"Imran",25));
	Collections.sort(li);
	for(SampleComparable s:li) {
		System.out.println(s);
	}
	
}
}
