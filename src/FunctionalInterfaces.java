@FunctionalInterface
interface functionalTest {

int show(int i,int j);
}

public class FunctionalInterfaces{
	public static void main(String[] args) {
	functionalTest ft	=(i,j)-> {int  x=i+j;return x;};
		System.out.println(ft.show(10,1));
		
	}
}

