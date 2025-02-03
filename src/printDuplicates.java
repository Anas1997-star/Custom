import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class printDuplicates {
public static void main(String[] args) 
{ 
//	String s="anas ahmed";
//	
//	Map<Object, Long> m=s.chars().mapToObj(x->(char) x).collect(Collectors.groupingBy(x->x,Collectors.counting()));
//	System.out.println(m);
List<Integer> li=Arrays.asList(2,3,4,5,6,7,2,3,8);
Set<Integer> m=li.stream().collect(Collectors.groupingBy(x->x,Collectors.counting())).entrySet().stream().filter(x->x.getValue()>1).map(x->x.getKey()).collect(Collectors.toSet());
System.out.println(m);
}
}
