@FunctionalInterface
interface functionalTest {

int show(int i,int j);
}

public class FunctionalInterfaces{
	public static void main(String[] args) {
	functionalTest ft	=(i,j)->{return i+j;};
		System.out.println(ft.show(10,1));
		
	}
}

