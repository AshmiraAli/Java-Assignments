import java.util.ArrayList;
public class FindMissingElement
{
	
	public static void main(String[] args)
	{
		ArrayList<Integer> array = new ArrayList<>();
		array.add(10);
		array.add(3);
		array.add(20);
		array.add(7);
		array.add(15);
		System.out.println(array);
		
		//sort the array
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
		
		ArrayList<Integer> result = new ArrayList<>();
		
		if(array.isEmpty())
		{
			System.out.println("Array is empty.");
		}
		else
		{
			int min = array.get(0);
			int max = array.get(array.size()-1);
			for(int i = min; i <= max; i++)
			{
				
					if(! array.contains(i))
					{
						result.add(i);
					}
			}
			System.out.println(result);
		}
		
	}
}