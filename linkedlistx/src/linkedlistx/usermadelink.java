package linkedlistx;

public class usermadelink {
	static class Node{
		String names;
		Node next;
	}

	public usermadelink() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Node node1=new Node();
		Node  node2=new Node();
		Node  node3=new Node();
		Node  node4=new Node();
		Node  node5=new Node();
		node1.names="Straight";
		node2.names="Bent";
		node3.names="Equals";
		node4.names="Well";
		node5.names="Storm";
		
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.names=null;
		do 
        {
            System.out.print(node1.names+" ");
            node1=node1.next;       //we are assigning the next address of the linked list to the current address 
        }
		while(node1.next!=null);
		
		

	}

}
