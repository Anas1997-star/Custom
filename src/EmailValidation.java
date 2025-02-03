import java.util.Scanner;

public class EmailValidation 
{
static String s1,

regex="^[a-zA-Z0-9_.-]+@[a-zA-z_.-]+$";

public static void main(String[] args) {

	Scanner s=new Scanner(System.in);
	 s1=s.next();
	 boolean resultant=Regex(s1);
		if(resultant) {
			System.out.println("email is valid");
		}
		else {
			System.out.println("email is invalid");
		}
}
	
	static boolean Regex(String s1) {
		boolean res=s1.matches(regex);
		return res;
				

		
}

}
