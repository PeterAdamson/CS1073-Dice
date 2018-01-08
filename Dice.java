// Author: Andrew Hampton and Peter Adamson
import java.util.Random;

public class Dice 
{
	
	public static int roll(int num)
	{	
		
		int die = num;
		Random gen = new Random();
		
		return gen.nextInt(die);
		
	 	
	} 	


}
