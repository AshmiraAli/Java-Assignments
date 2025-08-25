import java.util.*;
class SortArrayList
{
	public static void Sort(List<Integer> list)
	{
		for(int i=0;i<list.size()-1;i++)
		{
			for(int j=0;j<list.size()-i-1;j++)
			{
				if(list.get(j)>list.get(j+1))
				{
					int temp=list.get(j);
					list.set(j,list.get(j+1));
					list.set(j+1,temp);
				}
			}
		}
	}
	public static void main(String args[])
	{
		List<Integer> list=new ArrayList<>();
		list.add(55);
		list.add(27);
		list.add(20);
		list.add(18);
		list.add(45);
		
		System.out.println("Original List:"+list);
		
		Sort(list);
		
		System.out.println("Sorted List:"+list);
	}
}