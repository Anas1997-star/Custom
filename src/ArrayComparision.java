import java.util.Arrays;

public class ArrayComparision{
	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,8};
		int b[]= {3,2,4,6,5,7,8,9};
		boolean result=   areEqual(a,b);
		if(result) {
			System.out.println("Two arrays are equal");
		}
		else {
			System.out.println("Two arrays are not equal");
		}
	}

	private static boolean areEqual(int[] a, int[] b) {
		// TODO Auto-generated method stub
		
		Arrays.sort(a);
		Arrays.sort(b);
		if(a.length!=b.length) {
			return false;
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) {
				return false;
			}
		}
		return true;
	}
}