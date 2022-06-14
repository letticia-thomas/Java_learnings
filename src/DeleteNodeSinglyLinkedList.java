
public class DeleteNodeSinglyLinkedList {
	public static void printList(Node head)
	{
		while(head != null)
		{
			System.out.println(head.val);
			head = head.next;
		}
	}
	public static void main(String[] args) {
		
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		int givenVal = 2;
		Node head = node1;
		Node current = node1;
		Node prev = node1;
		
		if(node1.val== givenVal)
		{
			head = node1.next;
		}
		while(current!= null)
		{
			if(current.val == givenVal)
			{
				prev.next = current.next;
			}
			prev = current;
			current= current.next;
		}
		printList(head);
		

	}

}
