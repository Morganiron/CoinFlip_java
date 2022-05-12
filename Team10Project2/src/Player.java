
public class Player {
	
	private String playerName;
	private double balance;
	
	
	/**
	 * Default constructor
	 */
	public Player()
	{
		playerName = "";
		balance = 0.00;
	}
	
	/**
	 * Constructor
	 * @param name : The player's name
	 * @param bal : The player's balance
	 */
	
	public Player(String name, double bal)
	{
		playerName = name;
		balance = bal;
	}
	
	/**
	 * The setName method sets the player's name
	 */
	
	public void setName(String name)
	{
		playerName = name;
	}
	
	/**
	 * The setBal method sets the player's balance
	 */
	
	public void setBal(double bal)
	{
		balance = bal;
	}
	
	//return player's name
	public String getName()
	{
		return playerName;
	}
	
	//return player's balance
	public double getBal()
	{
		return balance;
	}
		
}//end class
