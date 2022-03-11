package week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// input data {3,2,11,4,6,7};
		List<Integer> input = new ArrayList<Integer>();
		input.add(3);
		input.add(2);
		input.add(11);
		input.add(4);
		input.add(6);
		input.add(7);
		Collections.sort(input);
		System.out.println("Sorted vlues are : " + input);
		int i = input.size();
		System.out.println("Second largest value from last : " + input.get(i - 2));

	}
}
