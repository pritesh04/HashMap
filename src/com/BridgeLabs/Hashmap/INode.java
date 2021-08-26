package com.BridgeLabs.Hashmap;

interface INode<K> {
	K getkey();

	void setKey(K key);

	INode getNext();

	void setNext(INode next);

}
