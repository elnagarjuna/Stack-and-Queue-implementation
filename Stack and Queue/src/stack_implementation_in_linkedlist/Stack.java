package stack_implementation_in_linkedlist;

import java.util.*;

public class Stack<T> {
	
	private Node top;
	private int size;
	
	private class Node {
		private T data;
		private Node next;
		public Node(T item){
			this.data = item;
			this.next = null;
		}
	}
	
	Stack(){
		top = null;	
	}
	
	public void push(T item) {
		Node newNode = new Node(item);
		newNode.next = top;
		top = newNode;
		size++;
		System.out.println("The item is inserted.\n");
	}
	
	public T pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		T result = top.data;
		top = top.next;
		size--;
		return result;
	}
	
	public T peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	public Boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public void display() {
		Node current = top;
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
}