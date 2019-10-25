package mulshankar13.winterbe;

import java.util.stream.Stream;

public class Sample2 {

	public static void main(String[] args) {

		/*
		 * Arrays.asList("a1", "a2", "a3") .stream() .findFirst()
		 * .ifPresent(System.out::println); // a1
		 * 
		 */
		Stream.of("a1", "a2", "a3").findAny().ifPresent(System.out::println);
	}

}
