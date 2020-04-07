
public class Dlinklist {
	Node head;
	Node tail;
	
	public void insert(int data)
	{
		Node n = new Node();
		n.data = data;
		if(head == null)
		{
			head = n;
			tail = n;
			head.prev = null;
			tail.next = null;
		}
		else
		{
			tail.next = n;
			n.prev = tail.next;
			tail = n;
			tail.next = null;
		}
	
	}
	public void insertAtEnd(int data)
	{
		Node n = new Node();
		n.data = data;
		tail.next = n;
		n.prev = tail;
		tail = n;
	}
	public void insertInBetween(int pos,int data)
	{
		Node node = new Node();
		node.data = data;
		Node n = head;
		Node temp = null;
		for(int i=0;i<pos-2;i++)
		{
			n = n.next;
		}
		temp = n.next;
		n.next = node;
		node.prev = n;
		node.next = temp;
		temp.prev = node;
		
	}
	public void deleteLast()
	{
		tail.prev.next = null;
	}
	public void deleteFirst()
	{
		head = head.next;
		head.prev = null;
	}
	public void deleteInMiddle(int pos)
	{
		Node n = head;
		Node temp = null;
		for(int i=0;i<pos-1;i++)
		{
			n = n.next;
			
		}
		temp = n.next;
		n.prev.next = temp;
	}
	public void print()
	{
		Node temp = head;
		while(temp.next != null)
		{
			System.out.println("Node is ----> " + temp.data );
			temp = temp.next;
		}
		System.out.println("Node is ----> " + temp.data );
	}
}
