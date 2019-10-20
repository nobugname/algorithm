package code;

class List {
	private Node head;
	
	class Node {
		private int num;
		private Node next;
		
		public Node(int num){
			this.num = num;
		}
		public int getNum() {
			return this.num;
		}
		public void addNode(Node newnode) {
			newnode.next = head.next;
			head.next = newnode;
		}
		public void printList() {
			if (this.next != null)
				this.next.printList();
			else 
				System.out.println(this.num);
		}
	}
	public List() {
		
	}
	public void add(int num) {
		Node node = new Node(num);
		if (this.head.next == null) {
			this.head.next = node;
		}
		else {
			this.head.addNode(node);
		}
	}
	public void print() {
		if(this.head.next != null) {
			this.head.printList();
		}
	}
	public void create() {
		
	}
	public void reverse() {
		
	}
}
public class listCode{
	public static void main(String[] args) {
		List list = new List();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.print();
	}
}
