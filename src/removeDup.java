import java.util.HashSet;

public class removeDup{
	public static void main(String[] args)
	{
		String s="anas ahmed";
		String result=removeDuplicates(s);
		System.out.println(result);
	}

	private static String removeDuplicates(String s)
	{
		// TODO Auto-generated method stub
		
		HashSet<Character> h=new HashSet<>();
		StringBuilder sb=new StringBuilder();
		for(char ch:s.toCharArray()) {
			if(h.add(ch)) {
				sb.append(ch);
			}
		}
		
		return sb.toString();
	}
}