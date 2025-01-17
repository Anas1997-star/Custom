import java.util.ArrayList;
import java.util.List;

public class Substrings {
public static void main(String[] args) {
	String s="djkajkdjabclkdjflxyz";
	List<String>result=subStrings(s);
	
	System.out.println(result);
}

private static List<String> subStrings(String s) {
	
	List<String> li=new ArrayList<>();
	StringBuilder x=new StringBuilder();
	x.append(s.charAt(0));
	for(int i=1;i<s.length();i++) {
		if(s.charAt(i)==s.charAt(i-1)+1) {
			x.append(s.charAt(i));
		}
		else {
			if(x.length()>1) {
				li.add(x.toString());
			}
			x.setLength(0);
			x.append(s.charAt(i));
		}
	}
	if(x.length()>1) {
		li.add(x.toString());
		x.append(s.charAt(0));
		
	}
	return li;
}
}
