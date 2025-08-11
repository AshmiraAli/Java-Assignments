public class InsertionSort
{
	public static void InsertionSort(ArrayADT array)
	{
        for (int i = 1; i < array.getSize(); i++) 
		{
            int key = array.get(i);
			int j = i - 1;
            while (j >= 0 && array.get(j) > key) 
			{
				
                array.set(j+1,array.get(j));
                j--;
            }
            array.set((j+1),key);
        }
        System.out.print("Sorted: ");
        array.traverse();
	}
	public static void main (String[] args)
	{
		ArrayADT A1=new ArrayADT(5);
		A1.insert(0, 5);
        A1.insert(1, 2);
        A1.insert(2, 7);
        A1.insert(3, 3);
		A1.insert(4, 2);
		System.out.println();
		InsertionSort(A1);
	}
}