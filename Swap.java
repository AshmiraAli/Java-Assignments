class Node
{
	String data;
	Node next;
	public Node(String data)
	{
		this.data=data;
	}
}
class Swap
{
	public static void swap(Node head, String w1, String w2) 
	{
		Node node1=null;
		Node node2=null;
		Node temp=head;
		while(temp!=null) 
		{
			if(temp.data.equals(w1)) 
				node1=temp;
			if(temp.data.equals(w2)) 
				node2=temp;
			temp=temp.next;
		}
	
		if(node1!=null&&node2!=null) 
		{
			String t = node1.data;
			node1.data = node2.data;
			node2.data = t;
		}
	}
    public static void printSentence(Node head) 
	{
        while (head != null) 
		{
			System.out.print(head.data + " ");
			head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) 
	{
        Node head=new Node("life");
        head.next=new Node("hell");
        head.next.next=new Node("hevan");
        swap(head,"hell","hevan");
        printSentence(head);
    }
}