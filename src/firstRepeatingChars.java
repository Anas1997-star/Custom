import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class firstRepeatingChars{
	public static void main(String[] args) {
String s="shaik anas ahmed"; 
    Map<Object, Long> m=  s.chars().mapToObj(x->(char) x).collect(Collectors.groupingBy(x->x,Collectors.counting()));
       System.out.println(m);
		
		//count of each word from the list
		
//		List<Integer> li=Arrays.asList(2,3,4,5,2,1,4);
//		Set<Integer> s= li.stream().collect(Collectors.groupingBy(x->x,Collectors.counting())).entrySet().stream()
//		.filter(x->x.getValue()>1).map(x->x.getKey()).collect(Collectors.toSet());
//		System.out.println(s);
	}
}