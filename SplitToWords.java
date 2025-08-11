import java.util.Scanner;
public class SplitToWords
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your sentence : ");
		String sent=scan.nextLine();
		//spilit into words
		String[] words=sent.split(" ");
		System.out.println();
		//print words
		/*System.out.println("Words in the sentence : ");
		for(String word : words)
		{
			System.out.println(word);
		}*/
		System.out.println("Reversed words:");
        for (String word : words) 
		{
            // Reverse the word
            String reversed = new StringBuilder(word).reverse().toString();
            System.out.println(reversed);
		}	
	}
}