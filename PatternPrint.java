public class PatternPrint
{
	public static void generatePattern(char[] array,int length)
	{
		if(length==0)
			return;
		for(int i=0;i<length;i++)
		{
			System.out.print(array[i]);
		}
		System.out.println();
		generatePattern(array,length-1);
		for(int i=0;i<length;i++)
		{
			System.out.print(array[i]);
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		char[] array={'a','b','c'};
		generatePattern(array,array.length);
	}
}