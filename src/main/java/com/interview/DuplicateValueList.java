package com.interview;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateValueList {

	public static void main(String[] args) {

		List<Integer> original = Arrays.asList(1, 2, 3, 2, 3, 4, 5, 2);

		// using set and Stream
		System.out.println("Set ==>" + getList(original));

		// using list and stram
		List<Integer> result = null;

		result = original.stream().distinct().filter(entry -> Collections.frequency(original, entry) > 1)

				.collect(Collectors.toList());
		// returns {1,3}
		// returns only numbers which occur more than once
		System.out.println("returns only numbers which occur more than once==>" + result);

		result = original.stream().filter(e -> Collections.frequency(original, e) == 1).collect(Collectors.toList());
		// returns {2,6,8,7}
		// returns numbers which occur only once
		System.out.println("returns numbers which occur only once==>" + result);

		result = original.stream().distinct().collect(Collectors.toList());
		// returns {1,2,3,6,8,7}
		// returns the list without duplicates
		System.out.println("returns the list without duplicates==>" + result);

		List<Integer> dps =original.stream().distinct().filter(entry -> Collections.frequency(original, entry) >1).collect(Collectors.toList());
			
		System.out.println("Ins--->"+dps);
	}

	public static Set<Integer> getList(List<Integer> list) {

		Set<Integer> uniques = new HashSet<>();

		return list.stream().filter(e -> !uniques.add(e)).collect(Collectors.toSet());

	}

}
