package com.gv.streamapi;
import java.util.Arrays;
import java.util.stream.IntStream;
public class MapFunction {
		public static void main(String[] args) {
			int [] intArray= {1,3,4,5,7,9,8,2,10,12,14,17,18,57};
			IntStream intStreams=Arrays.stream(intArray);
			intStreams.filter((no)-> no%2==0)
			.map(no->no+1)
			.forEach(no->System.out.println(no));
		}

	}

