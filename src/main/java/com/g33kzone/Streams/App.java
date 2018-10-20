package com.g33kzone.Streams;

public class App {
	public static void main(String[] args) {

		StreamFeatures stream = new StreamFeatures();

		long startTime = System.currentTimeMillis();

		// Logic for Sequential Stream
		System.out.println("*** Sequential Steam ***");
		stream.filter();
		System.out.printf("Process completed in - %d milliseconds %n%n", System.currentTimeMillis() - startTime);

		// Logic for Parallel Stream
		System.out.println("*** Parallel Steam ***");
		long startTimeParallel = System.currentTimeMillis();
		stream.parallelStreamFilter();
		System.out.printf("Process completed in - %d milliseconds %n%n",
				System.currentTimeMillis() - startTimeParallel);

		// Logic to check empty strings
		System.out.println("*** Filter - Is Empty ***");
		stream.isEmpty();

		// Logic for Squares
		System.out.println("*** For Each ***");
		stream.forEach();

		// Logic to reduce elements of stream to a single value
		System.out.println("*** Reduce ***");
		stream.reduce();

		// Logic to map items in the collection to other objects as per the predicate
		// passed as argument
		System.out.println("*** Map ***");
		stream.map();

		// Logic to map items in the collection to other objects as per the predicate
		// passed as argument
		System.out.println("*** Sort ***");
		stream.sort();
	}
}
