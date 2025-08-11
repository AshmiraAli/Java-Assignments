public class FindSecondLargest
{
	public static void FindSecondLargest(ArrayADT array,int size)
	{
		if (size < 2) {
            System.out.println("Not enough elements.");
            return;
        }
        int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            int a = array.get(i);
            if (a > largest) {
                secondLargest = largest; largest = a;
            } else if (a > secondLargest && a != largest) {
                secondLargest = a;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest element is not found.");
            
        }
        System.out.println(" Second Largest :"+secondLargest);
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
		A1.traverse();
		int size=A1.getSize();
		FindSecondLargest(A1,size);
	}
}