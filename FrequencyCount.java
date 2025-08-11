import java.util.ArrayList;
public class FrequencyCount
{
	public static void main(String[] args)
	{
		ArrayList<String> array = new ArrayList<>();
		array.add("Hello");
		array.add("Hi");
		array.add("Hello");
		array.add("Good");
		array.add("Nice");
		System.out.println(array);
		
		if(array.isEmpty())
		{
			System.out.println("array is empty.");
		}
		// count frequency of the elements
		else
		{
			int n=array.size();
			boolean[] counted = new boolean[n];//use for avoid repeting same word in output.
			
			for(int i = 0; i <= n-1; i++)
			{
				if(counted[i])
						continue;
				int count = 1;
				for(int j= i+1; j<= n-1; j++)
				{
					
					if(array.get(i).equals(array.get(j)))
					{
						count++;
						counted[j] = true;
					}
				}
				counted[i] = true;
				System.out.println(array.get(i)+" appear "+count+" times.");
				
			}
		}
	}
}