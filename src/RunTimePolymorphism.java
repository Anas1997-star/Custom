class Test1{
	public int work(int x,int y) {
		return x*y;
	}
	
}
public class RunTimePolymorphism extends Test1 {
	public int work(int x,int y) {
		return x+y;
	}
public static void main(String[] args) {
	Test1 t1=new RunTimePolymorphism(); //Upcasting 
//	t1=new Test1();         //to print superclass object
int z=	t1.work(5,4);
System.out.println(z);
}
}
