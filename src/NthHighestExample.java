import java.util.Arrays;
import java.util.List;


public class NthHighestExample{
	public static void main(String[] args) {

List<Integer> li=Arrays.asList(2,9,6,14,6,8,1,11,20);
//	//third highest element
long x=li.stream().sorted().skip(2).findAny().get();
System.out.println(x);
	}
	}
	
		
