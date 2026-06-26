package com.j8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(56);
		al.add(18);
		al.add(73);
		al.add(27);
		al.add(19);
		al.add(32);
		al.add(93);
		al.add(86);

		List<Integer> evenNums = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println(evenNums);

		List<Integer> updatedMarks = al.stream().map(j -> j + 5).collect(Collectors.toList());
		System.out.println(updatedMarks);

		long failedStudents = al.stream().filter(mk -> mk < 35).count();
		System.out.println(failedStudents);

		List<Integer> normalSort = al.stream().sorted().collect(Collectors.toList());
		System.out.println(normalSort);

		List<Integer> customized = al.stream().sorted((i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0)
				.collect(Collectors.toList());
		System.out.println(customized);

		int minNum = al.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(minNum);

		int maxNum = al.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(maxNum);

	}
}
