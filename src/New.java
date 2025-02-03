import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class New{
	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(2,4,3,1,5,6,3,4);

//		int a[]= {4,3,2,4,6};
//		Arrays.sort(a));
		
	String s="shaik ahmed";
	Map<Object, Long> m=s.chars().mapToObj(x->(char) x).filter(x->x!=' ').collect(Collectors.groupingBy(x->x,Collectors.counting()));
    System.out.println(m);
	//		    		 
	}
}