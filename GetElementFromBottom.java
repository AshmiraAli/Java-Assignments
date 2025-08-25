import java.util.Scanner;
import java.util.*;

class GetElementFromBottom
{
	public static void getNthFromBottom(Stack<Integer> stack)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the bottom element:");
		int n=in.nextInt();
		if(n<0||n>=stack.size())
		{
			System.out.println("Number is invalid");
		}
		System.out.println(stack.get(stack.size()-n));
	}
	
	public static void main(String args[])
	{
		Stack<Integer> stack=new Stack<>();
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(12);
		System.out.println("Stakc"+stack);
		getNthFromBottom(stack);
	}
}