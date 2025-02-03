import java.util.HashSet;

public class RemoveDuplicates{
	public static void main(String[] args) {
		String s="anas ahmed";
        String result=removeDup(s);
        System.out.println(result);
	}

	private static String removeDup(String s) {
		// TODO Auto-generated method stub
		HashSet<Character> hs=new HashSet<>();
		StringBuilder sb=new StringBuilder();
		for(char ch:s.toCharArray()) {
			if(hs.add(ch)) {
				sb.append(ch);
			}
		}
		return sb.toString();
	}

	
}