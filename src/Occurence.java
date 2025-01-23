import java.util.Scanner;

public class Occurence{
	public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
    String s1=    sc1.nextLine();
    int il=s1.length();
    Scanner sc2=new Scanner(System.in);
    String s2=sc2.next();
    s1=s1.replace(s2, "");
    int fl=s1.length();
    System.out.println(il-fl);
	
	}
}