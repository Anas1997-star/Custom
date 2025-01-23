import java.util.HashSet;
import java.util.Scanner;

public class CustomDup {
public static void main(String[] args) {
String s="cloudtech";
char ch[]=s.toCharArray();
String result=removeDup(s,ch);
System.out.println(result);

}

private static String removeDup(String s, char[] ch) {
	// TODO Auto-generated method stub
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<s.length();i++) {
		if(ch[i]!='c') {
			sb.append(s.charAt(i));
		}
	}
	return sb.toString();
}
}

	
	
