package com.InsertionSort.test;

import com.InsertionSort.sorting.InsertionSortAlgorithm;

public class TestInsertionSort {

	public static void main(String[] args) {
		int[] arr = {2,6,21,5,43,33,43};
		int arr1[] = {21,11,13,22,25,7,10,8,1};
		
		System.out.println("Ascending");
		InsertionSortAlgorithm.insertionSortAscending(arr);
		System.out.println("======================================");
		System.out.println("Descending");
		InsertionSortAlgorithm.insertionSortDescending(arr);
		System.out.println("======================================");
		
		System.out.println("Ascending");
		InsertionSortAlgorithm.insertionSortAscending(arr1);
		System.out.println("======================================");
		System.out.println("Descending");
		InsertionSortAlgorithm.insertionSortDescending(arr1);

	}

}
