package com.BridgeLabs.Hashmap;

public class MyNode1<K, V> implements INode<K> {
	private K key;
	private V value;

	MyNode1<K, V> next;

	public MyNode1(K key, V value) {

		this.key = key;
		this.value = value;
		this.next = null;
	}

//	@Override
//	public String toString() {
//		return "MyNode [key=" + key + ", next=" + next + "]";
//	}

	@Override
	public K getkey() {
		return key;
	}

	@Override
	public void setKey(K key) {

		this.key = key;
	}

	@Override
	public void setNext(INode next) {
		this.next = (MyNode1<K, V>) next;

	}

	@Override
	public INode getNext() {
		return next;

	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(" MyMapNode{ k=").append(key).append(" V=").append(value).append(" } ");
		if (next != null)
			str.append("->").append(next);

		return str.toString();

	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

}
