import java.util.Comparator;

class Student1 {
int id;
String name;
long marks;
Student1() {
	super();
}
@Override
public String toString() {
	return "Student1 [id=" + id + ", name=" + name + ", marks=" + marks + "]";
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
public long getMarks() {
	return marks;
}
public void setMarks(long marks) {
	this.marks = marks;
}
public Student1(int id, String name, long marks) {
	super();
	this.id = id;
	this.name = name;
	this.marks = marks;
}
}
public class Student implements Comparator<Student1>{

	@Override
	public int compare(Student1 s1, Student1 s2) {
		return s1.name.compareTo(s2.name);
	}
	
	
}
