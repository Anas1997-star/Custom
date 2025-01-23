import java.util.ArrayList;
import java.util.List;

public class Substrings{
	public static void main(String[] args) {
		String s="kdjfabcdedjflkxyzkjd";
	   List<String> result=subStrings(s);
	   System.out.println(result);
	}

	private static List<String> subStrings(String s) {
	List<String> li=new ArrayList<>();
	StringBuilder sb=new StringBuilder();
	sb.append(s.charAt(0));
	for(int i=1;i<s.length();i++) {
		if(s.charAt(i)==s.charAt(i-1)+1) {
			sb.append(s.charAt(i));
		}
		else {
			if(sb.length()>1) {
				li.add(sb.toString());
				
			}
			sb.setLength(0);
			sb.append(s.charAt(i));
		}
	}
	if(sb.length()>1) {
		sb.append(s.charAt(0));
		li.add(sb.toString());
	}
	return li;
}
}