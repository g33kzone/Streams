package com.g33kzone.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFeatures {

	private static List<String> customer = Arrays.asList("male", "female", "female", "male", "female", "male", "female",
			"male", "female");

	private static List<String> strings = Arrays.asList("abc", "", "", "xyz", "a", "a123");

	private static List<String> javaFeatures = Arrays.asList("Abstraction", "Polymorphism", "Reflection", "Stream",
			"Lambda");

	private static List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	public void filter() {

		List<String> maleList = customer.stream().filter("male"::equalsIgnoreCase).collect(Collectors.toList());

		List<String> femaleList = customer.stream().filter("female"::equalsIgnoreCase).collect(Collectors.toList());

		System.out.printf("Count of Male customers - %d%n", maleList.size());
		System.out.printf("Count of Female customers - %d%n", femaleList.size());
	}

	public void parallelStreamFilter() {

		List<String> maleList = customer.parallelStream().filter("male"::equalsIgnoreCase).collect(Collectors.toList());

		List<String> femaleList = customer.parallelStream().filter("female"::equalsIgnoreCase)
				.collect(Collectors.toList());

		System.out.printf("Count of Male customers - %d%n", maleList.size());
		System.out.printf("Count of Female customers - %d%n", femaleList.size());
	}

	public void isEmpty() {

		int isEmptyCount = (int) strings.parallelStream().filter(string -> string.isEmpty()).count();
		System.out.printf("Empty Count - %d%n%n", isEmptyCount);
	}

	public void forEach() {

		number.stream().forEach(y -> System.out.printf("%d ", y));
		System.out.printf("%n%n");
	}

	public void reduce() {

		int even = number.parallelStream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);

		System.out.printf("%d%n%n", even);
	}

	public void map() {

		List<Integer> score = Arrays.asList(2, 3, 2, 4, 4, 5, 7, 2, 3, 4);

		score.stream().map(x -> x * x).distinct().forEach(x -> System.out.printf("%d ", x));
		System.out.printf("%n%n");
	}

	public void sort() {

		javaFeatures.stream().sorted().forEach(x -> System.out.printf("%s ", x));
	}

}
