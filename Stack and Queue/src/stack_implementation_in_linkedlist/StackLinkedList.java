package stack_implementation_in_linkedlist;

import java.util.*;

public class StackLinkedList {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			Stack<Object> st = new Stack<Object>();
			int choice;
			do {
				System.out.println("1. To insert an item.");
				System.out.println("2. To delete an item.");
				System.out.println("3. Top of the stack.");
				System.out.println("4. Stack is empty or not.");
				System.out.println("5. Size of the list.");
				System.out.println("6. Display the elements.");
				System.out.println("7. Exit");
				System.out.println("-------------------------\n");
				System.out.print("Please enter your choice : ");
				choice = scan.nextInt();
				switch(choice) {
					case 1:
						System.out.print("Please insert an item : ");
					    String item = scan.next();
						st.push(item);
						break;
					case 2:
						Object del = st.pop();
						System.out.println("The deleted item is : "+del+"\n");
						break;
					case 3:
						Object peek = st.peek();
						System.out.println("Top of the stack is : "+peek+"\n");
						break;
					case 4:
						boolean flag = st.isEmpty();
						if(flag == true) {
							System.out.println("The stack is empty.\n");
						}else {
							System.out.println("The stack is not empty.\n");
						}
						break;
					case 5:
						int size = st.size();
						System.out.println("Size of the list is : "+size+"\n");
						break;
					case 6:
						st.display();
						break;
					case 7:
						System.out.println("Thankyou...");
						break;
					default:
						System.out.println("The choice is invalid...!\n");
						continue;
				}
			}while(choice != 7);
		}
	}
}
