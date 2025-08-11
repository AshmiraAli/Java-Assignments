public class EqualArray
{
	public static void EqualArray(ArrayADT A1,ArrayADT A2)
	{
		if (A2.getSize() != A1.getSize()) 
		{
            System.out.println("Not equal - length of the arrays are not equal,");
            return;
        }
        for (int i = 0; i < A1.getSize(); i++) 
		{
            if (A1.get(i) != A2.get(i)) 
			{
                System.out.println("Not equal - elements are not equal.");
                return;
            }
        }
        System.out.println("Equal");
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
		ArrayADT A2=new ArrayADT(5);
		A2.insert(0, 5);
        A2.insert(1, 2);
        A2.insert(2, 7);
        A2.insert(3, 3);
		A2.insert(4, 2);
		System.out.println();
		ArrayADT A3=new ArrayADT(5);
		A3.insert(0, 2);
        A3.insert(1, 3);
        A3.insert(2, 7);
        A3.insert(3, 5);
		A3.insert(4, 1);
		System.out.println();
		EqualArray(A1,A2);
		EqualArray(A1,A3);
		System.out.println();
		ArrayADT A4=new ArrayADT(3);
		A4.insert(0, 2);
        A4.insert(1, 3);
        A4.insert(2, 7);
        EqualArray(A3,A4);
	}
}