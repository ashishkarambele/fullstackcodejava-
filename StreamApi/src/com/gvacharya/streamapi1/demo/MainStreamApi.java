package com.gvacharya.streamapi1.demo;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MainStreamApi {

	public static void main(String[] args) {
	int[] intArray = {3,2,1,4,5,2,3,4,1,5,6};
		
		IntStream intStream = Arrays.stream(intArray);	
		
		OptionalInt min=
				
		intStream
		 .filter(no-> no>1)
		 .sorted()
	//	 .peek(no->System.out.print(no))
		 .map(no->no+2)
		 .distinct()
		 .filter(no-> no>5&&no<8)
	 //    .forEach(no->System.out.println(no));
		// .forEach(System.out.println);
	  .min();
		
		if(!min.isEmpty())
			System.out.println(min.getAsInt());

		intStream.close();
		}

}
