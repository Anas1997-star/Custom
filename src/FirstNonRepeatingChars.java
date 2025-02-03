import java.util.HashMap;

public class FirstNonRepeatingChars{
	public static void main(String[] args) {
		String s="swiss";
	Character result=	firstNonRepeating(s);
	System.out.println(result);
	}

	private static Character firstNonRepeating(String s) {
		// TODO Auto-generated method stub
		
		HashMap<Character,Integer> h=new HashMap<>();
		for(char ch:s.toCharArray()) {
			h.put(ch,h.getOrDefault(ch,0)+1);
		}
		for(char ch:s.toCharArray()) {
			if(h.get(ch)==1) {
				return ch;
			}
		}
		
		return null;
	}
}