




public class PizzaBase 
{
	private String Name;				
	private double Cost;				
	private boolean vegetarian;			
	
							
	
	public PizzaBase()				
	{
		setName(Name);				
		setCost(Cost);				
		setVeg(vegetarian);			
	}
	
	public String getName()				
	{
		return Name;
	}
	
	public void setName(String Name)		
	{
		this.Name = Name;			
	}
	
	public double getCost()				
	{
		return Cost;				
	}
	
	public void setCost(double Cost)		
	{
		this.Cost = Cost;
	}
	
	public boolean getVeg()				
	{
		return vegetarian;	
	}
	
	public void setVeg(boolean vegetarian)		
	{
		this.vegetarian = vegetarian;
	}

}
