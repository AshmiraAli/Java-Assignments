class CompareSentance
{
	public static boolean areEqual(Node n1,Node n2)
	{
		while(n1 !=null && n2!=null)
		{
			if(!n1.data.equalsIgnoreCase(n2.data))
				return false;
			n1=n1.next;
			n2=n2.next;
		}
		return n1==null && n2==null;
	}
	public static void main(String args[])
	{
		Node s1=new Node("hello");
		s1.next=new Node("hi");
		
		Node s2=new Node("Hello");
		s2.next=new Node("hi");
		
		
		System.out.println("Does the sentences are equal : "+areEqual(s1,s2));
	}
}