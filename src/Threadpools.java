import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpools{
	public static void main(String[] args) {
		ExecutorService executer=Executors.newFixedThreadPool(5);
		
		Runnable work=()->{
			for(int i=0;i<10;i++) {
			System.out.println("1st thread");
		}
	};
		Runnable working=()->{
			for(int i=0;i<15;i++) {
				System.out.println("2nd thread");
			}
		};
		
	executer.submit(work);
	executer.submit(working);
	executer.submit(work);
	executer.shutdown();
	}
}