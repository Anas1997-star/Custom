import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExamp {
public static void main(String[] args) {
	List<String> li=Arrays.asList("shaik","ahmed","vijay","ajay");
	Stream s=li.stream();
	s.filter(s1->((String) s1).endsWith("ay")).forEach(n->System.out.println(n));
}
}
