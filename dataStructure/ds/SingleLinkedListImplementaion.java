package ds;


public class SingleLinkedListImplementaion {
	
	Node head;
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
		}
		
		else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
			
		}
		
	}
	
	public static void disp(Node node) {
		Node current = node;
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
			
		}System.out.print(current);
		
	}
	
	//for sortd list
	public static Node removeDuplicate(Node node) {
		Node current = node;
		while(current != null) {
			Node temp = current;
			
			while(temp != null && temp.data == current.data) {
				temp = temp.next;
			}
			
			current.next = temp; 
			current = current.next;
			
		}
		
		disp(node);
		return node;
		
	}
	
	
	
	public static void main(String args[]) {
		/*SingleLinkedListImplementaion list= new SingleLinkedListImplementaion();
		list.insert(5);*/
		
		Node head = new Node(5);
		Node first = new Node(6);
		Node sec = new Node(6);
		Node third = new Node(8);
		
		head.next = first;
		first.next = sec;
		sec.next = third;
		third.next = null;
		
		disp(head);
		removeDuplicate(head);
		disp(head);
	}

}
