import java.util.Scanner;

public class countWords {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int result=countWords(s);
	System.out.println(result);
	
}

private static int countWords(String s) {
	// TODO Auto-generated method stub
	int count=0;
	for(int i=0;i<s.length()-1;i++) {
		if(i==0&&s.charAt(i)!=' '||s.charAt(i)!=' '&&s.charAt(i-1)==' ') {
			count++;
		}
	}
	return count;
}
}
