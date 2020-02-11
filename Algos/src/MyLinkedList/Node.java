package MyLinkedList;

public class Node<E> {
	Object element;
	Node<E> nextNode;
	
	public Object getElement() {
		return element;
	}
	public void setElement(Object element) {
		this.element = element;
	}
	public Node<E> getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node<E> nextNode) {
		this.nextNode = nextNode;
	}
	
	
}
