import java.util.ArrayList;
import java.util.List;

public class Substing{
	public static void main(String[] args) {
		String s="sdjfsadjfkadjabcdedslkhfadslxyz";
		List<String> result=subStrings(s);
		System.out.println(result);
	}

	private static List<String> subStrings(String s) {
		// TODO Auto-generated method stub
		StringBuilder x=new StringBuilder();
		List<String> li=new ArrayList<>();
		x.append(s.charAt(0));
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)-s.charAt(i-1)==1) {
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
			x.append(s.charAt(0));
			li.add(x.toString());
		}
		return li;
	}
}