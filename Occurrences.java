public class Occurrences
{
	public static void Occurrences(ArrayADT array,int element)
	{
		int count=0;
		for (int i = 0; i < array.getSize(); i++)
            if (array.get(i) == element) 
				count++;
        System.out.println("Occurrences of " + element + " : " + count);
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
		Occurrences(A1,2);
		
	}
}