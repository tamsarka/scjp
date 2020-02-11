package MyLinkedList;

import java.util.Iterator;

public class MLinkedList<E> implements Iterable<E>{
	//Head
	Node<E> firstNode;
	//Tail
	Node<E> lastNode;
	
	
	public Node<E> getFirstNode() {
		return firstNode;
	}
	public void setFirstNode(Node<E> firstNode) {
		this.firstNode = firstNode;
	}
	public Node<E> getLastNode() {
		return lastNode;
	}
	public void setLastNode(Node<E> lastNode) {
		this.lastNode = lastNode;
	}


	public void add(E ele){
		Node<E> newNode = new Node<E>();
		newNode.setElement(ele);
		// First time adding
		if(firstNode == null) {
			firstNode = lastNode = newNode;
		}else {
			// to add element in the existing list
			lastNode.setNextNode(newNode);
			lastNode = newNode;
		}
	}
	
	
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
