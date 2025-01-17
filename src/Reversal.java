import java.util.Scanner;

public class Reversal {
	
	static String str2=" ";
public static void main(String[] args)
  {
	Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String result=reversal(str);
		System.out.println(result);
		
  }
	
	static String reversal(String str) {
		
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		str2=ch+str2;
	}
	return str2;

}
}

//for reversing entire sentence
//String s2="this is ahmed";
//String s3[]=s2.split(" ");
//for(int i=s3.length-1;i>=0;i--) {
//	   System.out.println(s3[i]);
//}
//}
//}