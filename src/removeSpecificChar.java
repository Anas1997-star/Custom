
public class removeSpecificChar {
	public static void main(String[] args) {
		
		String s="AnasAhmed";
		char ch[] =s.toCharArray();
		    String result=  areEqual(s, ch);
		    System.out.println(result);
	}

	private static String areEqual(String s, char[] ch) {
		StringBuilder x=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(ch[i]!='A') {
			x.append(s.charAt(i));
			}
		}
		return x.toString();
	}
}
