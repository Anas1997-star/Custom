import java.util.ArrayList;
import java.util.List;

public class CustomDup{
	public static void main(String[] args) {
		String s="anas ahmed";
		char ch[]=s.toCharArray();
		String result=duplicate(s,ch);
		System.out.println(result);
	}

	private static String duplicate(String s, char[] ch) {
		// TODO Auto-generated method stub
		
		StringBuilder sb=new StringBuilder();
		for(char c:s.toCharArray()) 
		{
			if(c!='a') 
			{
				sb.append(c);
			}
		}
		return sb.toString();
	}
}