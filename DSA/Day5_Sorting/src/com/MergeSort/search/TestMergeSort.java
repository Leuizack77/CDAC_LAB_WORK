package com.MergeSort.test;

import com.MergeSort.sorting.MergerSortAlgorithm;

public class TestMergerSort {

	public static void main(String[] args) {
		
		int[] arr = {90,2,1,43,5,65,7,89};
		int arr1 [] = {20,5,7,11,21,2,7,25,30,3};
		MergerSortAlgorithm.mergeSortAscending(arr, 0, arr.length - 1);
		MergerSortAlgorithm.mergeSortAscending(arr1, 0, arr.length - 1);
	}

}
