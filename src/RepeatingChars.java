import java.util.Set;
import java.util.stream.Collectors;

public class RepeatingChars {
public static void main(String[] args) {
	String s="aabbcccdeeffghij";
	String result=duplicates(s);
	System.out.println(result);
//	usingStreams
//Set<Character> h=s.chars().mapToObj(x->(char) x).collect(Collectors.groupingBy(x->x,Collectors.counting()))
//.entrySet().stream().filter(x->x.getValue()>1).map(x->x.getKey())
//.collect(Collectors.toSet());
}

private static String duplicates(String s) {
	// TODO Auto-generated method stub
	StringBuilder x=new StringBuilder();
	for(int i=1;i<s.length();i++) {
		if(s.charAt(i)==s.charAt(i-1)) {
			x.append(s.charAt(i));
		}
	}
	return x.toString();
}
}


