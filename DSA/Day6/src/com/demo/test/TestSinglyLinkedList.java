package com.demo.test;

import com.demo.linkedLists.SinglyLinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList list1=new SinglyLinkedList();
		
		list1.addNode(100);
		list1.addNode(200);
		list1.addNode(300);
		list1.addNode(400);
		list1.addNode(500);
		list1.displayData();
		
		list1.addByPosition(2,150);
		//adding after last node
		list1.addByPosition(4,250);
		list1.addByPosition(6,350);
		list1.addByPosition(8,450);
		list1.displayData();
		
		//error check
		list1.addByPosition(20, 400);
		list1.displayData();
	}

}

