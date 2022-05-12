import java.util.Random;

public class Coin {
	
	double value;
	
	//Constructor
	public Coin(double val)
	{
		value = val;
		
	}//end Coin
	
	public void setValue(double val)
	{
		value = val;
	}//end setValue
	
	public double getValue()
	{
		return value;
	}//end getValue
	
	public static double flip(Coin coin)
	{
		double value;
		int number;
				
		Random randomNumbers = new Random();//create the random number generator
		number = randomNumbers.nextInt(100) + 1;//nextInt() starts at 0, so adds one to pick a number between 1 and 100
		
		if (number % 2 == 0)//if the number is evenly divided by 2 (even)
			value = coin.getValue();//it is considered "heads", set the value
		else
			value = 0.00;//otherwise it is odd or "tails" so the value will be 0
		
		return value;//return the result

	}//end flip
}//end Class