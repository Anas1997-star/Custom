import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentComparator
{
	public static void main(String[] args) 
	{
	ArrayList<Student1> al=new ArrayList<Student1>();
	al.add(new Student1(111,"Balu",99));
	al.add(new Student1(222,"malli",95));
	al.add(new Student1(333,"Ahmed",97));
    Collections.sort(al, new Student());
    
    //iterating list using listIterator
	Iterator<Student1> it=al.listIterator();
	while(it.hasNext()) 
	{
		System.out.println(it.next());
	}

}
}
