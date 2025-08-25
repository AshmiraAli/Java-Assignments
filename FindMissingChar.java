class FindMissingChar
{
	public static char findMissingChar(char[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]-arr[i-1]!=1)
				return (char)(arr[i-1]+1);
			
		}
		return ' ';
	}
	public static void main(String args[])
	{
		char[] arr={'a','b','d'};
		System.out.println(findMissingChar(arr));
	}
}
