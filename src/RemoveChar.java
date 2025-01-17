
public class RemoveChar {
public static void main(String[] args) {
	 String s="anasahmed";
	  char ch[]=s.toCharArray();
	String res= removeChars(s,ch);
	System.out.println(res);
}

private static String removeChars(String s ,char[] ch) {
	
	StringBuilder x=new StringBuilder();
	for(int i=0;i<s.length();i++) {
		if(ch[i]!='a') {
			x.append(s.charAt(i));
		}
	}
	return x.toString();
}
}
