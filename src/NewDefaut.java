import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class NewDefaut {
public static void main(String[] args) {
	String s="anas ahmed shaik";
	Set<Character> m=s.chars().mapToObj(x->(char) x).filter(x->x!=' ').collect(Collectors.groupingBy(x->x,Collectors.counting())).entrySet()
    .stream().filter(x->x.getValue()>1).map(x->x.getKey()).collect(Collectors.toSet());
    System.out.println(m);
}
}
