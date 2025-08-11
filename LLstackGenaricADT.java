class Node<T> 
{ 
	T data;
	Node<T>  next;
	
	public Node(T data)
	{
		this.data = data;
		this.next = null;
	}
}
class LLstackGenaricADT<T>
{
	Node<T> top=null;
	
	public boolean isEmpty()
	{
		return top == null;
	}
	public void push(T data)
	{
		Node<T> newNode = new Node<>(data);
		if(isEmpty())
		{
			top = newNode;
			return;
		}
		newNode.next = top; // addAtFrount
		top = newNode;
	}
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is underflow.");
			return;
		}
		top = top.next;
	}
	public T peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is underflow.");
			return null;
		}
		return top.data;
	}
	public boolean search(T data)
	{
		Node<T> current = top;
		while(current != null)
		{
			if(current.data != null && current.data.equals(data))
			{
				return true;
			}
			current=current.next;
		}
		return false;
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Stack is underflow.");
			return ;
		}
		Node<T> current = top;
		while(current != null)
		{
			System.out.print(current.data + ",");
			current=current.next;
		}
		System.out.println();
	}
	
	public static void main (String[] args)
	{
		LLstackGenaricADT<Integer> LLstack = new LLstackGenaricADT<>();
		System.out.println(LLstack.isEmpty());
		LLstack.push(5);
		LLstack.push(10);
		LLstack.push(15);
		LLstack.push(20);
		LLstack.display();
		LLstack.pop();
		System.out.print("After pop : ");
		LLstack.display();
		System.out.println("The peek : " +LLstack.peek());
		LLstack.display();
		
		LLstackGenaricADT<String> linkedStack = new LLstackGenaricADT<>();
		System.out.println(linkedStack.isEmpty());
		linkedStack.push("Hello");
		linkedStack.push("World");
		linkedStack.push("Life");
		linkedStack.push("Soul");
		linkedStack.display();
		linkedStack.pop();
		System.out.print("After pop : ");
		linkedStack.display();
		System.out.println("The peek : " +linkedStack.peek());
		linkedStack.display();
	}
}