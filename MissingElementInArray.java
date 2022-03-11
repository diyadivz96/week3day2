package week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInArray {

	public static void main(String[] args) {
		int count = 1;
		List<Integer> element = new ArrayList<Integer>();
		element.add(1);
		element.add(2);
		element.add(3);
		element.add(4);
		element.add(7);
		element.add(6);
		element.add(8);
		Collections.sort(element);
		System.out.println("Sorted vlues are : " + element);
		for (int i = 0; i <= element.size(); i++) {
			if (element.get(i) != i + count) {
				System.out.println("Missing element is : " + (i + count));
				break;
			}
		}
	}

}
