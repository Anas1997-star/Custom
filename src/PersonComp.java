import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class PersonCompartor implements Comparator<PersonCompartor>{
int id;
String name;
String address;
@Override
public String toString() {
	return "PersonCompartor [id=" + id + ", name=" + name + ", address=" + address + "]";
}
public PersonCompartor() {
	super();
}
public PersonCompartor(int id, String name, String address)
{
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
@Override
public int compare(PersonCompartor o1, PersonCompartor o2) {
	// TODO Auto-generated method stub
	return o1.name.compareTo(o2.name);
}
}
public class PersonComp{
public static void main(String[] args) {
	List<PersonCompartor> li=new ArrayList<>();
	li.add(new PersonCompartor(101,"shaik","hyd"));
	li.add(new PersonCompartor(102,"ahmed","blr"));
	li.add(new PersonCompartor(103,"imran","chennai"));
	Collections.sort(li,new PersonCompartor());
	for(PersonCompartor p:li) {
		System.out.println(p);
	}

}
}