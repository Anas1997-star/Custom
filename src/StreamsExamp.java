import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExamp{
	public static void main(String[] args) {
//		String s="anas ahmed shaik";
//		Map<Object, Long> h=s.chars().mapToObj(x->(char) x).collect(Collectors.groupingBy(x->x,HashMap::new ,Collectors.counting()));
//		System.out.println(h);
		List<String> li=Arrays.asList("shaik","ahmed","anas","mohiyar");
		Map<Integer, Long> m=li.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
	    System.out.println(m);
		
	}
}