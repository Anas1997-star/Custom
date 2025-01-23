public class sumOfArray{
	public static void main(String[] args) {
		int a[]= {1,2,3,5,6,7,8};
		 int result=sum(a);
		 System.out.println(result);
	}

	private static int sum(int[] a) {
		// TODO Auto-generated method stub
		int sum=0;
		int n=a.length+1,total=n*(n+1)/2;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		return total-sum;//missing number
	}
}