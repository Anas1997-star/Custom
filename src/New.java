import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class New{
	public static void main(String[] args) {
	String s="skfkdabcdekdfnlkxyz";
	  String result=   longestSubString(s);
	  System.out.println(result);
	}

	private static String longestSubString(String s) {
		String x="",y="";
		
		for(int i=1;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i-1)+1) {
				x=x+s.charAt(i);
			}
			else {
				if(x.length()>y.length()) {
					y=x;
					
				}
				x=""+s.charAt(i);
			}
				
		}
		if(x.length()>y.length())
		y=x;
		return y;
	}
}
