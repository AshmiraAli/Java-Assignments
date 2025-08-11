import java.util.ArrayList;
import java.util.Scanner;
public class FindElement
{
	public static void main(String[] args)
	{
		ArrayList<Integer> array = new ArrayList<>();
		System.out.println("Enter the array element : ");
		for (int i=0; i < 5; i++)
		{
			Scanner scan = new Scanner(System.in);
			int value = scan.nextInt();
			array.add(value);
		}
		System.out.println("The Array -> "+array);
		
		// sorting of the array
		int temp = 0;
		for(int i=0; i <= array.size()-1; i++)
		
		{
			for(int j=i+1; j <= array.size()-1; j++)
			{
				if(array.get(i) > array.get(j))
				{
					temp = array.get(i);
					array.set(i,array.get(j));
					array.set(j,temp);
				}
			}
		}
		System.out.println("Sorted array -> " + array);
		
		//get the k(index) as input,
		System.out.print("Enter the index(K) of the array : ");
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		
		if(array.isEmpty())
		{
			System.out.println("array is empty.");
			// insted of returning -1 i print a statement.
		}
		else if(K >= array.size())
		{
			throw new IndexOutOfBoundsException("Index out of range.");
			// insted of returning -1 i print a statement.
		}
		else
		{
			//fint kth element.
			int element = array.get(K);
			System.out.println("The kth index element -> " + element);
		}
	}
}