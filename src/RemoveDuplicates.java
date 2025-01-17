import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String result=removeDuplicates(s);
		System.out.println(result);
	}

	private static String removeDuplicates(String s) {
		
		StringBuilder x=new StringBuilder();
		HashSet<Character> hs=new HashSet<>();
		for(char ch:s.toCharArray())
		{
			if(hs.add(ch)) {
				x.append(ch);
			}
		}
		return x.toString();
	}
}