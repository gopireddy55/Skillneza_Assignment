





public class PizzaBuild 
{

	public static void main(String[] args) 						
	{
		Pizza pizza = new Pizza();						
		pizza.setPizzaBase(new PizzaTopping("thin", 2.50, false));		
		pizza.addTopping(new PizzaTopping("Tomato Sauce", 0.50, false));	
		pizza.addTopping(new PizzaTopping("Cheese", 0.50, false));		
		pizza.addTopping(new PizzaTopping("Ham", 1.25, true));			
		pizza.addTopping(new PizzaTopping("Pineapple", 1.25, false));		
		pizza.total();								
		
	}

}
