import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Threadpools {
	static volatile  int count=10;

public static void main(String[] args) {
	ExecutorService executer=Executors.newFixedThreadPool(5);
	
	Runnable work= ()-> {
		for(int i=0;i<10;i++) {
			System.out.println("1st thread");
		}
		
	};
	Runnable working=()->{
		try {
		for(int i=0;i<10;i++) {
			System.out.println("2nd thread");
			
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		
		}
		
	};
	
	executer.submit(work);
	executer.submit(working);
	executer.submit(work);
	executer.submit(working);
	executer.shutdown();
	
}
}
