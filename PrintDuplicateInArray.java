package week3day2;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicateInArray {

	public static void main(String[] args) {
		List<Integer> dup = new ArrayList<Integer>();
		dup.add(14);
		dup.add(12);
		dup.add(13);
		dup.add(11);
		dup.add(15);
		dup.add(14);
		dup.add(18);
		dup.add(16);
		dup.add(17);
		dup.add(19);
		dup.add(18);
		dup.add(18);
		dup.add(17);
		dup.add(20);
		for (int i = 0; i < dup.size(); i++) {
			for (int j = i + 1; j < dup.size() - 1; j++) {
				if (dup.get(i) == dup.get(j))
					System.out.println(dup.get(i));
			}
		}
	}
}
