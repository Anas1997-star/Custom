public class LongestSubStrings{
	public static void main(String[] args) {
		String s="dlfjajdabcdefkdfjaldxy";
		String result=longestSubString(s);
		System.out.println(result);
	}

	private static String longestSubString(String s) {
		// TODO Auto-generated method stub
		
		String x="",y="";
		for(int i=1;i<s.length();i++) {
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
		if(x.length()>y.length()) {
			y=x;
		}
		return y;
	}
}