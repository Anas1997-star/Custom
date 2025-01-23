import java.util.HashSet;
import java.util.Scanner;

public class removeDup{	
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=   sc.nextLine();
    String result=    removeDuplicates(s1);	
    System.out.println(result);
	}

	private static String removeDuplicates(String s1) {
		
		StringBuilder x=new StringBuilder();
		HashSet<Character> h=new HashSet<>();
		for(char ch:s1.toCharArray()) {
			if(h.add(ch)) {
				x.append(ch);
			}
		}
		return x.toString();
	}
}