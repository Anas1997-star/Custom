import java.util.ArrayList;
import java.util.Collections;

public class EmployeeComparable {
	
public static void main(String[] args) {
	ArrayList<Employee> al=new ArrayList<Employee>();
	al.add(new Employee(101,"Ahmed",30000));
	al.add(new Employee(102,"Balu",50000));
	al.add(new Employee(103,"Pavan",45000));
	al.add(new Employee(104,"Indra",80000));
	al.add(new Employee(105,"Ayan",80000));
	
	Collections.sort(al);
	for(Employee e:al) {
		System.out.println(e);
	}
}
}
