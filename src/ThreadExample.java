
public class ThreadExample extends Thread{
 public void run() {
	 for(int i=0;i<4;i++) {
		 System.out.println("1st thread");
	 }
	for(int i=0;i<3;i++) {
		System.out.println("2nd thread");
	}
 }
 public static void main(String[] args) {
	ThreadExample t1=new ThreadExample();
       	t1.run();
       	t1.run();
	
}
}
