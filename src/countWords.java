import java.util.Scanner;

public class countWords{
	static int count=0;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int result=countWords(s);
		System.out.println(result);
	}

	private static int countWords(String s) {
		// TODO Auto-generated method stub
		
		char ch[]=s.toCharArray();
		for(int i =0;i<s.length();i++) 
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ') 
			{
				count++;
			}
		}
		return count;
		
	}
}