import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class firstRepeatingChars{
	public static void main(String[] args) {
    String s="anas"; 
   Character h=  s.chars().mapToObj(x->(char) x).filter(x->x!=' ').collect(Collectors.groupingBy(x->x,Collectors.counting())).entrySet().stream()
      .filter(x->x.getValue()>1).findFirst().get().getKey(); 
    System.out.println(h);
		
//    first repeating character 
	}
}