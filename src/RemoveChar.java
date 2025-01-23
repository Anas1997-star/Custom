public class RemoveChar{
	public static void main(String[] args) {
		String x="anas ahmed";
		    char ch[] =x.toCharArray();
		   String result= removeChars(x,ch);
		   System.out.println(result);
	}

	private static String removeChars(String x, char[] ch) {
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<x.length();i++) {
			if(ch[i]!='a') {
		       sb.append(x.charAt(i));
			}
		}
		return sb.toString();
	}
}