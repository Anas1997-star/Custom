import java.util.Arrays;

public class ArrayReverse{
	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7};
		int result[]=arrayReverse(a);
		System.out.println(Arrays.toString(a));
	}

	private static int[] arrayReverse(int[] a) {
		// TODO Auto-generated method stub
		int s=0,e=a.length-1;
		int temp;
		while(s<e) {
			temp=a[s];
			a[s]=a[e];
			a[e]=temp;
			s++;
			e--;
		}
		return a;
	}
}