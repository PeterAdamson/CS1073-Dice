// Author: Andrew Hampton and Peter Adamson
public class DiceTest 
{
	public static void main(String[] args)
	{	int N = 100;
		int counter = 0;
		int[] counts = new int[6];
 		System.out.println("Totals Rolled");
		for (int i = 0; i<=N; i++)
		{

			int rolled = Dice.roll(6);
			
			counts[rolled] +=1;		
		
		
		}
		System.out.println("1\t 2\t 3\t 4\t 5\t 6 \t");
		for (int n=0; n< 6; n++)
		{
			System.out.print(counts[n]+"\t");	
		}
	} 
}
	
