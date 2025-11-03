package com.SelectionSort.search;

public class TestSelectionSort {

	public static void main(String[] args) {
		int[] arr= {15,13,30,20,5,7,21,2};
		SelectionSortAlgorithm.selectionSortAscending(arr);
		System.out.println("------------------------------------------");
		SelectionSortAlgorithm.selectionSortDescending(arr);
	}

}
