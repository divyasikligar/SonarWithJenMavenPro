package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.*;

public class Operations_3 {
	

	public static void main(String... args)
	{
		
	/*	new ArrayList<Integer>(Arrays.asList(10,2,300,4,5,6,7,8,9,10,5,8,3,2,6))
		.stream().limit(5).forEach(n->{System.out.println(n);});*/
		
		
//first 3 greater  number using stream api
		new ArrayList<Integer>(Arrays.asList(10,2,300,4,5,6,7,8,9,10,5,800,3,200,6))
		.stream()
		.sorted(Comparator.reverseOrder())		
		.limit(3).forEach(n->{System.out.println(n);});
		
		
		
		new ArrayList<Integer>(Arrays.asList(10,2,300,4,5,6,7,8,9,10,5,800,3,200,6,12))
		.stream()		
		.skip(4).forEach(n->{System.out.print(n+"\t");});
		System.out.println();
		
		
		new ArrayList<String> (Arrays.asList("happy","best","better","hope","good","happy"))
		.stream()
		.sorted()
		.distinct()
		.collect(Collectors.toList())
		.forEach(n -> System.out.println(n));
	
		
		
		
		

}
}
