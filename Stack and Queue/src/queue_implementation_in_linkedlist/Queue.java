package queue_implementation_in_linkedlist;

public class Queue<T> {
	
	private Node front;
	private Node rear;
	private int size;
	
	private class Node{
		private T data;
		private Node next;
		public Node(T item) {
			super();
			this.data = item;
			this.next = null;
		}
	}
	
	public void enQueue(T item) {
		if(front == null) {
			rear = new Node(item);
			front = rear;
		}else {
			rear.next = new Node(item);
			rear = rear.next;
		}
		System.out.println("The item is inserted.\n");
		size++;
	}
	
	public T deQueue() {
		if(front != null) {
			T result = front.data;
			front = front.next;
			size--;
			return result;
		}
		return null;
	}
	
	public T elementAtFront() {
		if(front == null) {
			throw new IndexOutOfBoundsException();
		}
		return front.data;
	}
	
	public Boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public void display() {
		Node current = front;
		while (current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
}