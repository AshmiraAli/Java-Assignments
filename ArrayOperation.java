import java.util.Scanner;
public class ArrayOperation
{
	public void findIndex(int[] A,int element)
	{
		for(int i=0;i<A.length;i++)
		{
			if (A[i]==element)
				System.out.println("	Index of the Element : "+ i );
		}
		System.out.println("	Element not found." );
	}
	public void sortArray(int[] A)
	{
		for(int i=0;i<A.length;i++)
		{
			for(int j=i+1;j<A.length;j++)
			{
				if(A[i]>A[j])
				{
					int temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}	
			}
		}
		System.out.print("	Sorted Array : ");
		System.out.print("[");
		for(int i=0;i<6;i++)
		{
			System.out.print(A[i]+",");
		}
		System.out.print("]");
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		int[] A = new int[6];
		for(int i=0;i<6;i++)
		{
			int no=scan.nextInt();
			A[i]=no;
		}
		//print them as array
		System.out.print("	Array : ");
		System.out.print("[");
		for(int i=0;i<6;i++)
		{
			System.out.print(A[i]+",");
		}
		System.out.print("]");
		System.out.println();
		// get the element as input
		System.out.print("Input the element : ");
		int element=scan.nextInt();
		
		ArrayOperation arrOp=new ArrayOperation();
		arrOp.findIndex(A,element);
		arrOp.sortArray(A);
	}
}