import java.util.Random;

public class DiceRoller 
{
	int sides;
	DiceRoller(int sides) 
	{
		this.sides = sides;
	}
	
	int roll()
	{
		Random r = new Random();
		return r.nextInt(this.sides)+1; 
	}
}
