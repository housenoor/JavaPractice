package com.Bridgelabzs;

import org.junit.Assert;
import org.junit.Test;

//purpose-declaring the test case for Creating Simple Linked List

public class MyLinkedListTest {
	@Test
	public void given3Number_WhenLinkedShouldPassedLinkedListTest() {

		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);

		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);

		boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}
}