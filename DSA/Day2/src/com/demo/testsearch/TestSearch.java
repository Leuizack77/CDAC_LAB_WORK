package com.demo.testsearch;

import com.demo.search.SearchingService;

public class TestSearch {
	public static void main(String args []) {
	int[] arr = {11, 17, 65, 23, 83};
	int[] arr1 = {10, 12, 14, 16, 18};
	
	int ans = SearchingService.sequenialSearch(arr, 17);
	int ans1 = SearchingService.binarySearchRecurrsive(arr1, 18, arr1[0], arr1.length-1);
	int ans2 = SearchingService.binarySearchNonRecurssive(arr1, 16);
	
	System.out.println(ans); // 1
	System.out.println(ans1); // -1
	System.out.println(ans2); // 3
	}
}
