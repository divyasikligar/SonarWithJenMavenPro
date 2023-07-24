package StreamApi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.*;

public class Operations_2 {

	public static void main(String... args)
	{
		
		System.out.println(
				
				new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,8,3,2,6))
				.stream()
				.filter( m -> m % 2 == 0 )
				.distinct().count()
				
				);		
		
		
		
	System.out.println(
				
				new ArrayList<Integer>(Arrays.asList(4,5,2,10,1,3))
				.stream()				
				.max(Comparator.naturalOrder()).get()				
				);	
	
	
	System.out.println(
			
			new ArrayList<Integer>(Arrays.asList(4,5,2,10,1,3))
			.stream()				
			.min(Comparator.naturalOrder()).get()				
			);	
	
	
	
	

	
	}
	
}
