package StreamApi;

import java.util.*;
import java.util.stream.Collectors;

public class Operations_1 {
	
	public static void main(String[] args) {
		
		new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,8,3,2,6))
		.stream()
		.filter( m -> m % 2 == 0 )
		.distinct()
		.collect(Collectors.toList())
		.forEach( n-> { System.out.println(n); });
		
		
		//peek() -> it use to print the list in intermediate operation
		
		new ArrayList<Double>(Arrays.asList(1098.00,3076.00,-3577.00,2048.00,-2598.00,4556.00,-4034.00))
		.stream()	
		
		
		.map(m -> m * 0.02)	
		.peek( n-> { System.out.print(n+"\t"); }) //peak will work on map
		
		
		.filter( m -> m < 0 )			//filter work on map
		.collect(Collectors.toList()).forEach( n-> {System.out.println("\n"+n); });
		
	}
	

}
