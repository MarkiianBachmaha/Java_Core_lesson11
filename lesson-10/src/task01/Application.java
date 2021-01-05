package task01;

import java.util.Arrays;
import java.util.Collections;

public class Application {

	public static void main(String[] args) {

		Integer[] array1 = { 1, 456, 49, 28, 2754, 4726, 34646, 456346, 3453, 4, 234, 2567, 63, 2, 83, 66, 84 };

		System.out.println("Sort in ascending order:");
		Arrays.sort(array1);
		System.out.println(Arrays.toString(array1) + ";");

		System.out.println();

		System.out.println("Sort in descending order:");
		Arrays.sort(array1, Collections.reverseOrder());
		System.out.println(Arrays.toString(array1) + ";");

	}

}