import java.util.Arrays;

public class ArraysEqual {
public static void main(String[] args) {
	
	int a[]= {2,4,3,8,7};
	int b[]= {4,3,2,7,8};
    boolean result= areEqual(a,b);
	if(result) {
		System.out.println("two arrays are equal");
	}
	else
	System.out.println("two arrays are not equal");
     }

private static boolean areEqual(int[] a, int[] b) {
        int i;
        if(a.length!=b.length) {
    		return false;
    	}  
	Arrays.sort(a);
	Arrays.sort(b);
	
    for( i=0;i<a.length;i++) {
   		 if(a[i]!=b[i]) 
   			 return false;
   	 }
	return true;
}
}
