
public class ThreadExample  extends Thread{
 public void run() {
	 for(int i=0;i<10;i++) {
		 System.out.println("1st thread");
	 }
	for(int i=0;i<5;i++) {
		System.out.println("2nd thread");
	}
 }
 public static void main(String[] args) {
	ThreadExample Te1=new ThreadExample();
	ThreadExample Te2=new ThreadExample();
	Te1.start();
	Te2.start();
	
}
}
