import java.util.Arrays;

public class ArraysEqual{
	public static void main(String[] args) {
		int a[]= {3,2,1,5,4};
		int b[]= {2,3,1,4,5};
	    boolean result= areEqual(a,b);
	    if(result) {
	    	System.out.println("Two Arrays are equal");
	    }
	    else {
	    	System.out.println("Two arrays are not equal");
	    }
	}

	private static boolean areEqual(int[] a, int[] b) {
		// TODO Auto-generated method stub
		
	    if(a.length!=b.length) {
	    	return false;
	    }
	    Arrays.sort(a);
	    Arrays.sort(b);
	    for(int i=0;i<a.length;i++) {
	    	if(a[i]!=b[i]) {
	    		return false;
	    	}
	    }
	    
		return true;
	}
	}
