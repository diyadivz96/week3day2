package week3day2;

import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDuplicate {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		System.out.println(text);
		Set<String> duplicate = new LinkedHashSet<String>();
		for (String string : split) {
			duplicate.add(string);
		}
		System.out.println("Duplicate words are removed :" + duplicate);

	}
}
