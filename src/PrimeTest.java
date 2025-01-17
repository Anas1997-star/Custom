import java.util.Scanner;

public class PrimeTest {
 static boolean prime (int n) {
	int x=0;
	for( int i=1;i<=n;i++) {
		if(n%i==0)
		x++;
	}
		if(x==2)
			return true;
		else
	
	return false;
	
}
 public int work(int x) {
	 return x+2;
 }
 public String does(String s) {
	 return "success";
 }
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),i;
boolean res=prime(n);
	if(res)
		System.out.println("prime");
	else
		System.out.println("not a prime");
}
}
