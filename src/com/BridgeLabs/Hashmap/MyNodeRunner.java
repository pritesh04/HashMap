package com.BridgeLabs.Hashmap;

public class MyNodeRunner {
	public static void main(String[] args) {
//		MyNode<Integer> firstNode = new MyNode<Integer>(56);
//		MyNode<Integer> secNode = new MyNode<Integer>(30);
//		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
//		firstNode.setNext(secNode);
//		secNode.setNext(thirdNode);
//		boolean result = firstNode.getNext().equals(secNode) && firstNode.getNext().getNext().equals(thirdNode);
//		System.out.println(result);

		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		MyNode<Integer> secNode = new MyNode<Integer>(30);
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> inBetween = new MyNode<Integer>(40);
		MyLinkedList linkedList = new MyLinkedList();
//		linkedList.append(firstNode);
//		linkedList.append(secNode);
//		linkedList.append(thirdNode);
//		linkedList.addBetween();
		linkedList.add(firstNode);
		linkedList.add(secNode);
		linkedList.add(thirdNode);
		// linkedList.delete();
		// linkedList.deleteLastElement();
		// linkedList.insertBetween(firstNode, secNode);
		// linkedList.deleteInBetween(secNode);
		linkedList.insertSpecific(secNode, inBetween);
		//linkedList.deleteInBetween(inBetween);
		
		
		
		linkedList.print();

	}
}
