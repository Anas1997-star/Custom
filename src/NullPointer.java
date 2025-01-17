import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.TreeSet;

public class NullPointer {
public static void main(String[] args) {
	
	try {
	TreeSet<String> set=new TreeSet<String>();
	set.add(null);
	}
	catch(Exception e) {
		System.out.println("null pointer exception is caught");
		e.printStackTrace();
	}
	
	String s=null;
	//Optional class to handle Nullpointer Exception
	Optional<String> op=Optional.ofNullable(s);
	if(op.isPresent()) {
		System.out.println(op.get());
	}
	else
		System.out.println("no value is present");
	
HashMap<Integer,String> map=new HashMap<Integer,String>();
	
map.put(1, "shaik");
map.put(2, "ahmed");
map.put(3, "Indra");

//for(Entry<Integer,String> en:map.entrySet()) {
//	System.out.println(en.getKey()+"  " + en.getValue());
//}

for (Entry<Integer,String> en:map.entrySet()) {
	System.out.println(en.getKey()+" "+en.getValue());
}
}
}
