public class RemoveDuplicate
{
	public static void RemoveDuplicate(ArrayADT array)
	{
		for(int i=0;i<array.getSize();i++)
		{
			int a=array.get(i);
			int j=i+1;
			while(j<array.getSize())
			{
				if (a == array.get(j))
					array.delete(i);
				j++;
			}
		}
		System.out.println("The array without duplicate : ");
		array.traverse();
	}
	public static void main(String[] args)
	{
		ArrayADT A1=new ArrayADT(5);
		A1.insert(0, 5);
        A1.insert(1, 2);
        A1.insert(2, 7);
        A1.insert(3, 3);
		A1.insert(4, 2);
		System.out.println();
		A1.traverse();
		RemoveDuplicate(A1);
	}
}