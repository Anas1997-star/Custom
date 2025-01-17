import java.util.HashSet;
import java.util.Scanner;

public class removeDup{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s= sc.nextLine();
//		char[] ch=s.toCharArray();
		String result=removeDuplicates(s);
		System.out.println(result);
	}

	private static String removeDuplicates(String s) {
		StringBuilder x=new StringBuilder();
		HashSet<Character> h=new HashSet<>();
		for(char ch1:s.toCharArray()) {
			if(h.add(ch1))
				x.append(ch1);
		}
		return x.toString();
		
	}
}