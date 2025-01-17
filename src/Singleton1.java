 class Singleton {

	private static Singleton instance;
	Singleton(){
	}
	public synchronized Singleton getInstance() {
		if(instance==null)
			instance=new Singleton();
		return instance;
	}

}
public class Singleton1 {
	public static void main(String[] args) {
		Singleton s=new Singleton();
	System.out.println(	s.getInstance());
	}
}
