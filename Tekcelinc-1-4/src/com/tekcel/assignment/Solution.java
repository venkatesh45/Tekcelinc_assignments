package com.tekcel.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	List<Employee> listOfEmployees = new ArrayList<Employee>();
	Map<Integer, Employee> mapOfEmployees = new HashMap<Integer, Employee>();

	public static void main(String[] args) {

		Solution soln = new Solution();

		// Problem 1
		System.out.println("Question 1");
		for (int i = 1; i <= 100; i++) {
			soln.listOfEmployees.add(new Employee(i, "emp" + Integer.toString(i), i * 100));
		}

		for (int i = 0; i < soln.listOfEmployees.size(); i++) {
			System.out.println(soln.listOfEmployees.get(i));
		}

		// Problem 2
		// Using the Emp class implementation, I should be able to print
		// employee details by their id
		System.out.println("Question 2");
		for (int i = 1; i <= 100; i++) {
			soln.mapOfEmployees.put(i, new Employee(i, "emp" + Integer.toString(i), i * 100));
		}
		
		for(Map.Entry<Integer, Employee> map:soln.mapOfEmployees.entrySet()){
			System.out.println("Id:"+map.getKey()+"	Value:"+map.getValue());
		}
		
		// Problem 3
		// sort the numbers by ascending order without using collections and
		// return it
		System.out.println("Question 3");
		int[] data = new int[100];

		for (int i = 99; i >= 0; i--)
			data[i] = i;

		int[] sortedData = getSortedNumbers(data);

		for (int i = 0; i < 99; i++) {
			System.out.println(sortedData[i]);
		}
		
		
		// Problem 4
		// sort the list by ascending order
		System.out.println("Question 4");
		Collections.shuffle(soln.listOfEmployees);

		soln.printSortedNumbers(soln.listOfEmployees);

	}

	private static int[] getSortedNumbers(int[] data) {

		int key;
		for (int i = 1; i < data.length; i++) {
			key = data[i];
			int j = i - 1;

			while (j >= 0 && data[j] > key) {
				data[j + 1] = data[j];
				j--;
			}
			data[j + 1] = key;
		}
		return data;
	}

	private void printSortedNumbers(List<Employee> listOfEmployees) {

		Collections.sort(listOfEmployees, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return e1.id - e2.id;
			}
		});

		for (int i = 0; i < listOfEmployees.size(); i++) {
			System.out.println(listOfEmployees.get(i));
		}

	}
}
