






import java.util.ArrayList;
import java.util.Scanner;

public class PizzaChoice
{
	private static ArrayList<PizzaBase> bases = new ArrayList<PizzaBase>();		
	private static ArrayList<PizzaTopping> tops = new ArrayList<PizzaTopping>();	
	private static Scanner keyboard;						
	private static int bInput;							
	private static int tInput;							
	
	public static void addBase(PizzaBase base)					
	{
		bases.add(base);
	}
	
	public static void addTop(PizzaTopping topping)					
	{
		tops.add(topping);
	}
		
	public static void main(String[] args) 						
	{
		
		Pizza pizza = new Pizza();						
		
		addBase(new PizzaTopping("Thin",2.50,false));
		addBase(new PizzaTopping("Thick",3.00,false));
		addBase(new PizzaTopping("Stuffed crust", 4.50,false));
		
		baseMenu(pizza);							
		
		try
		{
		baseChoice(pizza);							
		}		
        catch(IllegalArgumentException iae)						
		{
        		System.out.println("Invalid selection, please select again");	
        		baseChoice(pizza);						
		}
		
		
		
		addTop(new PizzaTopping("Tomato Sauce",0.50, false));
		addTop(new PizzaTopping("BBQ Sauce", 0.50, false));
		
		addTop(new PizzaTopping("Cheese", 0.50, false));
		
		addTop(new PizzaTopping("Ham", 1.25, true));
		addTop(new PizzaTopping("Pepperoni", 1.50, true));
		addTop(new PizzaTopping("Bacon", 2.00, true));
		addTop(new PizzaTopping("Chicken", 1.75, true));
		addTop(new PizzaTopping("Ground Beef", 1.50, true));
		
		addTop(new PizzaTopping("Mushrooms", 0.75, false));
		addTop(new PizzaTopping("Onions", 0.75, false));
		addTop(new PizzaTopping("Peppers", 1.00, false));
		addTop(new PizzaTopping("Pineapple", 1.25, false));
		addTop(new PizzaTopping("Sweetcorn", 0.50, false));
		
		toppingMenu(pizza);							
		try
		{
		toppingChoice(pizza);							
		}
        catch(IllegalArgumentException iae)						
		{		
        		System.out.println("Invalid selection, please select again");	
        		toppingChoice(pizza);						
		}
		pizza.total();								
	}
	
	public static void baseMenu(Pizza pizza)					
	{
		int i = 1;								
		keyboard = new Scanner(System.in);					
		
		System.out.println("Pizza base selection");											
		String newLine = System.getProperty("line.separator");			
		System.out.print("\t------------------------------------" + newLine);	
		System.out.format("\t%15s%21s", "-Bases-",  "-Price- "+ newLine);	
		System.out.print("\t------------------------------------" + newLine);	
		
		for(PizzaBase base : bases)									
		{
			System.out.printf(newLine + "\t%5s. %-15s:%10s", i, base.getName(), base.getCost());	
			i++;											
		}
		
		System.out.print(newLine + "\t------------------------------------" + newLine);			
	}
	
	public static void baseChoice(Pizza pizza)								
	{	
		System.out.println("Please enter your choice of base by entering its respective number.");	
		bInput = keyboard.nextInt();									

		if(bInput<1||bInput>3)										
		{
			throw new IllegalArgumentException("\nMust enter a number between 1 and 3.\nPlease run again.");	
		}
		else if(bInput == 1)										
		{
			pizza.setPizzaBase(new PizzaTopping("Thin", 2.50, false));				
			System.out.println("You've selected 'Thin'.\n");					
		}
		else if(bInput == 2)
		{
			pizza.setPizzaBase(new PizzaTopping("Thick", 3, false));				
			System.out.println("You've selected 'Thick'.\n");					
		}
		else if(bInput == 3)
		{
			pizza.setPizzaBase(new PizzaTopping("Stuffed", 4.50, false));				
			System.out.println("You've selected 'Stuffed crust'.\n");				
		}
		pizza.setbInput(bInput);									
	}
	
	public static void toppingMenu(Pizza pizza)								
	{
		int i = 1;											
		
		System.out.println("Pizza topping selection");
		String newLine = System.getProperty("line.separator");						
		System.out.print("\t------------------------------------" + newLine);				
		System.out.format("\t%15s%21s", "-Toppings-",  "-Price- "+ newLine);				
		System.out.print("\t------------------------------------" + newLine);				
		
		for(PizzaTopping topping : tops)								
		{
			System.out.printf(newLine + "\t%5s. %-15s:%10s", i, topping.getName(), topping.getCost());	
			i++;											
		}
		
		System.out.print(newLine + "\t------------------------------------" + newLine);			
	}
	
	public static void toppingChoice(Pizza pizza)								
	{	
		System.out.println("Please select your toppings by entering their respective numbers."		
					+ "\nEnter 0 at any time to end the selection.\n");	
		do												
		{
			tInput = keyboard.nextInt();								
			pizza.settInput(tInput);								
		if(tInput<-1||tInput>13)									
		{
			throw new IllegalArgumentException("\nMust enter a number between 0 and 13.\nPlease run again.");
		}	
		else if(tInput == 0)										
		{
			System.out.println("End of topping selection.");					
			break;
		}
		else if(tInput == 1)										
		{
			pizza.addTopping(new PizzaTopping("Tomato Sauce", .50, false));				
			System.out.println("You've selected 'Tomato Sauce'.");					
		}
		else if(tInput == 2)
		{
			pizza.addTopping(new PizzaTopping("BBQ", .50, false));
			System.out.println("You've selected 'BBQ Sauce'.");
		}
		else if(tInput == 3)
		{
			pizza.addTopping(new PizzaTopping("Cheese", .50, false));
			System.out.println("You've selected 'Cheese'.");
		}
		else if(tInput == 4)
		{
			pizza.addTopping(new PizzaTopping("Ham", 1.25, true));
			System.out.println("You've selected 'Ham'.");
		}
		else if(tInput == 5)
		{
			pizza.addTopping(new PizzaTopping("Pepperoni", 1.50, true));
			System.out.println("You've selected 'Pepperoni'.");
		}
		else if(tInput == 6)
		{
			pizza.addTopping(new PizzaTopping("Bacon", 2.00, true));
			System.out.println("You've selected 'Bacon'.");
		}
		else if(tInput == 7)
		{
			pizza.addTopping(new PizzaTopping("Chicken", 1.75, true));
			System.out.println("You've selected 'Chicken'.");
		}
		else if(tInput == 8)
		{
			pizza.addTopping(new PizzaTopping("Ground Beef", 1.50, true));
			System.out.println("You've selected 'Ground Beef'.");
		}
		else if(tInput == 9)
		{
			pizza.addTopping(new PizzaTopping("Mushrooms", 0.75, false));
			System.out.println("You've selected 'Mushrooms'.");
		}
		else if(tInput == 10)
		{
			pizza.addTopping(new PizzaTopping("Onions", 0.75, false));
			System.out.println("You've selected 'Onions'.");
		}
		else if(tInput == 11)
		{
			pizza.addTopping(new PizzaTopping("Peppers", 1.00, false));
			System.out.println("You've selected 'Peppers'.");
		}
		else if(tInput == 12)
		{
			pizza.addTopping(new PizzaTopping("Pineapple", 1.25, false));
			System.out.println("You've selected 'Pineapple'.");
		}
		else if(tInput == 13)
		{
			pizza.addTopping(new PizzaTopping("Sweetcorn", 0.50, false));
			System.out.println("You've selected 'Sweetcorn'.");
		}
		} while(tInput != 0);	
	}
	
}
