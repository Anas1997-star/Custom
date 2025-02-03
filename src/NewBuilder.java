public class NewBuilder{

	static int count=0;
	public static void main(String[] args) {
		String s="hi this is anas ahmed";
		
		     int result=  wordCount(s);
		     System.out.println(result);
		
	}
	private static int  wordCount(String s) {
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ') {
				count++;
			}
		}
		return count;
}
}
			

