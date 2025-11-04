package com.SelectionSort.test;

import com.SelectionSort.sorting.SelectionSortAlgorithm;

public class TestSelectionSort {

	public static void main(String[] args) {
		int[] arr= {15,13,30,20,5,7,21,2};
		System.out.println("Ascending Selection Sort => ");
		SelectionSortAlgorithm.selectionSortAscending(arr);
		
		System.out.println("=============================================");
		
		System.out.println("Descending Selection Sort => ");
		SelectionSortAlgorithm.selectionSortDescending(arr);
	}
}
