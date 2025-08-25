import java.util.*;
class RemoveDuplicate
{
	public static void RemoveDuplicate(Stack<Integer> stack)
	{
		Stack<Integer> s1=new Stack<>();
		while(!stack.isEmpty())
		{
			int elt=stack.pop();
			if(!s1.contains(elt))
			{
				s1.push(elt);
			}
		}
		//Stack<Integer> s2=new Stack<>();
		while(!s1.isEmpty())
		{
			stack.push(s1.pop());
		}
	}
	public static void main(String args[])
	{
		Stack<Integer> stack=new Stack<>();
		stack.push(4);
		stack.push(4);
		stack.push(7);
		stack.push(3);
		stack.push(6);
		System.out.println("Original stack:"+stack);
		RemoveDuplicate(stack);
		System.out.println("Array without duplicates:"+stack);
		
	}
}
