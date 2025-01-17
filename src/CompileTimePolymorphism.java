class Test{
	public void activity() {
		System.out.println("example of compiletime polymorphism");
	}
	public void activity(String s) {
		System.out.println("overloaded ");
	}
}
public class CompileTimePolymorphism {
public static void main(String[] args) {
	

	Test t=new Test();
	 
	t.activity();
	t.activity("2nd method");
}
}
