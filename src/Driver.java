
public class Driver 
{
	public static void main(String[] args) 
	{
		DiceRoller dice6 = new DiceRoller(6);
		
		System.out.println(dice6.roll());
		
		for (int i = 0; i < 20; i++)
		{
			System.out.println(dice6.roll());
		}
	}
}
