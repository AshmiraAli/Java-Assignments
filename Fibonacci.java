import java.util.Scanner;
public class Fibonacci
{
	//Recursive to find fibonacci
	public static int findFibonacci(int number)
	{
		if (number==0)
			return 0;
		else if (number==1)
			return 1;
		else
			return findFibonacci(number-1)+findFibonacci(number-2);
	}
	public static void main (String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n=scan.nextInt();
		System.out.println("The Fibonacci Series : ");
		for(int i=0;i<=n;i++)
		{
			System.out.print(findFibonacci(i)+",");
		}
		
	}
}
