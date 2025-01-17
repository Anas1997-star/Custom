import java.util.Arrays;

public class ArrayComparision {
	public static void main(String[] args) {
		
int a[]= {3,2,5,4} ,b[]= {4,2,5,3};
boolean result=compareArrays(a,b);
if(result)
System.out.println("two arrays are equal");
else 
	System.out.println("not equal");
}

private static boolean compareArrays(int[] a, int[] b) {
	int i,j=0;
	
	if(a.length!=b.length)
		return false;
	
	Arrays.sort(a);
	Arrays.sort(b);

for(i=0;i<a.length;i++) {
	if(a[i]!=b[i]) {
		return false ;
	}
	
}
return true;
}
}


