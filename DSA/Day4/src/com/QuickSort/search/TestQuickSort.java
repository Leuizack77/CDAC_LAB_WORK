package com.QuickSort.test;

import java.util.Arrays;
import java.util.stream.IntStream;

import com.QuickSort.sorting.QuickSortAlgorithm;

public class TestQuickSort {

	public static void main(String[] args) {
		int[] arr = {54,43,333,231,115,208,327,324};
		int arr1[] = {5,3,8,1,4,6,2,7};
		
	 QuickSortAlgorithm.quicksort(arr, 0, arr.length - 1);
	 System.out.println("============================================");
	 QuickSortAlgorithm.quicksort(arr1, 0, arr.length - 1);
	}
}
