
public class CountWordsInaSubtring {


	public static void main(String[] args) {
		String s= "hi this is Ahmedshaik"
				+ "";
		int count=0;
		     int x=  countWords(s);
		     
		     System.out.println(x);
	}
		static int countWords(String s) {
			
		int count =0;
		for(int i=0;i<=s.length()-1;i++) {
			char[] ch=s.toCharArray();
			if(i==0&ch[i]!=' '||ch[i]!=' '&ch[i-1]==' ') {
				count++;
				
			}
			
			
		}
		return count;
		
	}
}

