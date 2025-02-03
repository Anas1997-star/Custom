import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class NthHighestExample{
	public static void main(String[] args) {

List<Integer> li=Arrays.asList(2,9,6,14,6,8,1,11,20);
//third highest element
long x=li.stream().sorted().skip(2).findAny().get();
System.out.println(x);
//Set<Integer> m=li.stream().collect(Collectors.groupingBy(x->x,Collectors.counting())).entrySet().stream().filter(x->x.getValue()>1).map(x->x.getKey()).collect(Collectors.toSet());
//System.out.println(m);
	}
}

		
