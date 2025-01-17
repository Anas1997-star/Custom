import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamsandLambda {
public static void main(String[] args)
{
//	List<String> ll=new LinkedList<String>();
//	ll.add("Swapnil");
//	ll.add("Anas");
//	ll.add("Manisha");
//	Collections.sort(ll);
//for(String t:ll){
//	System.out.println(t);
//}
//}
////	lambda expresssion
	{ 
	functionalTest ft=	(i,j)-> i*j;
	int res=ft.show(5, 4);
	System.out.println(res);
		}
	
      //Streams 
//	List<Integer> li=Arrays.asList(20,15,5,4,56);
//	Stream s=li.stream();
//	 s.filter(x->(Integer) x%2==0)
//	.map(x->(Integer) x*2)
//	.sorted()
//	.forEach(n->System.out.println(n));
//
List<String> li2=Arrays.asList("ahmed","balu","venkat","irfan","imran");
Stream<String> s=li2.stream();
s.filter(s1-> s1.endsWith("an")).sorted().map(s1->s1.toUpperCase())
.collect(Collectors.toList())
.forEach(n->System.out.println(n));
	

}
}



