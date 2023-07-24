package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;


public class Operations_4 
{
	public static void main(String... args)
	{
		new ArrayList<String>(Arrays.asList("B","A","G","H"))
		.stream()
		.parallel()  // parallel stream that will not maintain the order of the stream
		.forEach(n -> {System.out.println(n);});
		
		System.out.println("________________________");
		
		new ArrayList<String>(Arrays.asList("B","A","G","H"))
		.stream()
		.parallel()  // parallel stream that will not maintain the order of the stream
		.forEachOrdered(n -> {System.out.println(n);});
		
		
		
		
		//Storing data in stream directly.
		Stream<Integer> s = Stream.of(1,2,3,4,5,6,7);
		//s.mapToDouble(m->m+5).forEach(n->{System.out.println(n);});
		//s.mapToInt(m->m+5).forEach(n->{System.out.println(n);});		
		s.mapToLong(m->m+5).forEach(n->{System.out.println(n);});
		
		
		//System.out.println(s.count());
		
		
		
			
	
	}
}