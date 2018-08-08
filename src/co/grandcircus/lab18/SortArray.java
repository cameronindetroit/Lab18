package co.grandcircus.lab18;

import java.util.HashMap;
import java.util.Map;

public class SortArray {

	public static void main(String[] args) {

		// Using Hashmap

		// This is a O(n^2) Algorithm. It uses nested loops to accomplish it's goal

		// Build Empty Array
		int[] myArray = { 1, 2, 3, 2, 2, 4, 5, 5, 7, 8, 4, 4, 1, 0, 10 };

		// Create HashMap to store number and how many times it occurs in Array

		Map<Integer, Integer> map = new HashMap<>();

		for (int key : myArray) {

			if (map.containsKey(key)) {
				int occurrence = map.get(key);
				occurrence++;
				map.put(key, occurrence);
			} else {
				map.put(key, 1);
			}

		}

		// display array to show the number of times each item appeared in the array

		for (Integer key : map.keySet()) {

			int occurrence = map.get(key);
			System.out.println(key + " occur " + occurrence + " times. \n\n");

		}

		// Using Array to sort

		int[] newArray = new int[10];

		for (int item : myArray) {
			newArray[item]++;

		}
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(i);
			System.out.println(newArray[i]);

		}

	}

}
