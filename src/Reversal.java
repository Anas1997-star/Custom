import java.util.Scanner;

public class Reversal{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s= sc.nextLine();
		String result=reversal(s);
		System.out.println(result);
	}

	static String reversal(String s) 
	{
		// TODO Auto-generated method stub
		char[] ch=s.toCharArray();
		String s1="";
		for(int i=0;i<s.length();i++) 
		{
			s1=ch[i]+s1;
		}
		return s1;
	}
}