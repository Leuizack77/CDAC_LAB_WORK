package com.demo.search;

public class SearchingService {
	public static int sequenialSearch(int[] arr, int search) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == search) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearchNonRecurssive(int[] arr, int search) {
		int low=0;
		int high = arr.length-1;
		int cnt = 0;
		while(low<=high) {
			int mid = (low+high)/2;
			cnt++;
			if(arr[mid]==search) {
				System.out.println("Comparisons are:" + cnt);
				return mid;
			}
			if(search<arr[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		System.out.println("Comparisons are: " + cnt);
		return -1;
	}
	
	
	public static int binarySearchRecurrsive(int[] arr, int search, int low, int high) {
		//System.out.println("Binary Search Called: " + low + "----" + high);
		if(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==search) {
				return mid;
			}else if(search<arr[mid]){
				return binarySearchRecurrsive(arr, search, low, mid-1);
			}else {
				return binarySearchRecurrsive(arr, search, mid+1, high);
			}
		}
		return -1;
	}
}
