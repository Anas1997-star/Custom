
public class Employee  implements Comparable<Employee>{
int id;
String name;
long salary;
public Employee(int id, String name, long salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
public Employee() {
	super();
}
@Override
public int compareTo(Employee emp) {
	if(emp.salary==salary)
	return 0;
	else 
		if(emp.salary>salary)
			return 1;
		else
			return -1;
}
}
