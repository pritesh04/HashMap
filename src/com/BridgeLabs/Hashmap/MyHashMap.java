package com.BridgeLabs.Hashmap;

public class MyHashMap<K, V> {
	MyLinkedList<K> ll;

	public MyHashMap() {
		ll = new MyLinkedList<>();
	}

	public V get(K key) {
		MyNode1<K, V> myMapNode = (MyNode1<K, V>) this.ll.search(key);
		
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public void add(K key, V value) {
		MyNode1<K,V> myMapNode = (MyNode1<K,V>) this.ll.search(key);
		if(myMapNode == null) {
			myMapNode = new MyNode1<>(key,value);
			this.ll.append(myMapNode);
		}
		else {
			myMapNode.setValue(value);
		}
	}

	public void  remove(K val)
	{
		MyNode1<K, V> mv= (MyNode1<K, V>) ll.search(val);
		if(mv == null) {
			ll.append(mv);
		}
		else {
			ll.delete(val);
		}
	}
	@Override
	public String toString() {
		return "MyHashMap [ll=" + ll + "]";
	}
}
