public class ZeroestoEnd
{
	public static void main(String[] args)
	{
		int a[]= {1,0,3,2,4,5,0,9};
	
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				a[count++]=a[i];
			}
		}
		while(count<a.length) {
			a[count++]=0;
		}
		for(int j=0;j<a.length;j++) 
		{
			
		System.out.print(a[j]+" ");
	}
}
}