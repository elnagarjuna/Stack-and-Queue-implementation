package queue_implementation_in_linkedlist;

import java.util.*;

public class QueueLinkedist {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			Queue<Object> q = new Queue<Object>();
			int choice;
			do {
				System.out.println("1. To insert an item.");
				System.out.println("2. To delete an item.");
				System.out.println("3. Front of the queue.");
				System.out.println("4. Queue is empty or not.");
				System.out.println("5. Size of the Queue.");
				System.out.println("6. Display the elements.");
				System.out.println("7. Exit");
				System.out.println("-------------------------\n");
				System.out.print("Please enter your choice : ");
				choice = scan.nextInt();
				switch(choice) {
					case 1:
						System.out.print("Please insert an item : ");
					    String item = scan.next();
						q.enQueue(item);
						break;
					case 2:
						Object del = q.deQueue();
						System.out.println("The deleted item is : "+del+"\n");
						break;
					case 3:
						Object peek = q.elementAtFront();
						System.out.println("Front of the queue is : "+peek+"\n");
						break;
					case 4:
						boolean flag = q.isEmpty();
						if(flag == true) {
							System.out.println("The queue is empty.\n");
						}else {
							System.out.println("The queue is not empty.\n");
						}
						break;
					case 5:
						int size = q.size();
						System.out.println("Size of the queue is : "+size+"\n");
						break;
					case 6:
						q.display();
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