package StreamApi;

import java.util.stream.*;
import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
    	List<String> L = Arrays.asList("happy","best","better","hope","good");
    	
		L.stream()   /* Stream*/
		.map(m -> m.toUpperCase())  /*Intermediate operation*/
		.collect(Collectors.toList()) 
		.forEach( n -> {System.out.println(n);  });/* termination operation*/
		
		

Arrays.asList("happy","best","better","hope","good")
.stream()
.map(m -> m.concat("Good Morning !"))
.collect(Collectors.toList())
.forEach( n -> {System.out.println(n);});


List<Integer> l = Arrays.asList(1,2,3);
l.forEach((  m ->{
	m += 2;
			System.out.println(m);
}));


List<Integer> l2 = Arrays.asList(1,2,3);
int sum = l2.stream().map(x -> x*x).reduce((x,y) ->x+y).get();
System.out.println(sum);
    }
}
