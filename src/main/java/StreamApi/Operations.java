package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.*;

public class Operations {

	public static void main(String[] args) {
		
		/*
		new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10))
		.stream()
		.map(  m->  m*10 )
		.collect(Collectors.toList())
		.forEach( n-> { System.out.println(n); });
		
		*/
		
		
		new ArrayList<Integer>(Arrays.asList(4,2,6,9,3,5,10,8))
		.stream()
		.sorted()
		.collect(Collectors.toList())
		.forEach( n-> { System.out.println(n+"\t"); });
		
		System.out.println("___________________________________________________");
		
		new ArrayList<Integer>(Arrays.asList(4,2,6,9,3,5,10,8))
		.stream()
		.sorted(Comparator.reverseOrder()) //descending order
		.collect(Collectors.toList())
		.forEach( n-> { System.out.print(n+"\t"); });
		
		
				
		
	}
	
}
