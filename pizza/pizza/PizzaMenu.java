






import java.util.Scanner;

public class PizzaMenu
{
	private static int pIn;					
	private static Scanner keyboard;			
	
	public static void main(String[] args) 			
	{
		Pizza pizza = new Pizza();			
		menu(pizza);					
		try						
		{
			menuSelect(pizza);
		}
        catch(IllegalArgumentException iae)			
		{
        		System.out.println("Invalid selection, please select again");		
        		menuSelect(pizza);							
		}
		pizza.total();					
	}
	
	public static void menu(Pizza pizza)			
	{
		keyboard = new Scanner(System.in);		
		
		System.out.println("Pizza selection");
		String newLine = System.getProperty("line.separator");					
		System.out.print("\t-----------------------------------------" + newLine);		
		System.out.format("\t%15s%25s", "-Pizzas-",  "-Description- "+ newLine);		
		System.out.print("\t-----------------------------------------" + newLine);		
		
		System.out.format("\t%-5s%1s\t\t%10s", "1.", "Margherita", "Cheese and tomato" + newLine);		
		System.out.format("\t%-5s%1s\t\t%10s", "2.", "Hawaiian", "Ham and pineapple" + newLine);			
		System.out.format("\t%-5s%1s\t\t%10s", "3.", "Americano", "Chicken, pepperoni and onions" + newLine);
		System.out.format("\t%-5s%1s\t\t%10s", "4.", "TexasBBQ", "Chicken, peppers and Bacon" + newLine);
		System.out.format("\t%-5s%1s\t\t%10s", "5.", "Veggie", "Peppers, mushrooms, onions and sweetcorn" + newLine);
	
		System.out.print(newLine + "\t-----------------------------------------" + newLine);	
	}
	
	public static void menuSelect(Pizza pizza)
	{
		System.out.println("Please enter your pizza by entering its respective number.");	
		pIn = keyboard.nextInt();								

		if(pIn<1||pIn>5)									
		{
			throw new IllegalArgumentException("\nMust enter a number between 1 and 5.\nPlease run again.");	
		}
		else if(pIn == 1)									
		{
			margherita(pizza);								
			System.out.println("You've selected 'Margherita'.\n");				
		}
		else if(pIn == 2)
		{
			hawaiian(pizza);								
			System.out.println("You've selected 'Hawaiian'.\n");				
		}
		else if(pIn == 3)
		{
			americano(pizza);								
			System.out.println("You've selected 'Americano'.\n");				
		}
		else if(pIn == 4)
		{
			texasBBQ(pizza);								
			System.out.println("You've selected 'TexasBBQ'.\n");				
		}
		else if(pIn == 5)
		{
			veggie(pizza);																
			System.out.println("You've selected 'Veggie'.\n");				
		}
		pizza.setpIn(pIn);
	}
	
	
	
	
	public static void margherita(Pizza pizza)
	{
		pizza.setPizzaBase(new PizzaTopping("thin", 2.50, false));			
		pizza.addTopping(new PizzaTopping("Tomato Sauce",0.50, false));			
		pizza.addTopping(new PizzaTopping("Cheese",0.50, false));			
	}
	
	public static void hawaiian(Pizza pizza)
	{
		pizza.setPizzaBase(new PizzaTopping("thin", 2.50, false));			
		pizza.addTopping(new PizzaTopping("Tomato Sauce",0.50, false));			
		pizza.addTopping(new PizzaTopping("Cheese",0.50, false));			
		pizza.addTopping(new PizzaTopping("Ham",1.25, true));				
		pizza.addTopping(new PizzaTopping("Pineapple",1.25, false));			
	}	
	
	public static void americano(Pizza pizza)
	{
		pizza.setPizzaBase(new PizzaTopping("Stuffed crust", 4.50, false));		
		pizza.addTopping(new PizzaTopping("BBQ Sauce",0.50, false));			
		pizza.addTopping(new PizzaTopping("Cheese",0.50, false));			
		pizza.addTopping(new PizzaTopping("Chicken",1.75, true));			
		pizza.addTopping(new PizzaTopping("Pepperoni",1.50, true));			
		pizza.addTopping(new PizzaTopping("Onion",0.75, false));			
		
	}
	
	public static void texasBBQ(Pizza pizza)
	{
		pizza.setPizzaBase(new PizzaTopping("thick", 3.00, false));			
		pizza.addTopping(new PizzaTopping("BBQ Sauce",0.50, false));			
		pizza.addTopping(new PizzaTopping("Cheese",0.50, false));			
		pizza.addTopping(new PizzaTopping("Chicken",1.75, true));			
		pizza.addTopping(new PizzaTopping("Peppers",1.00, false));			
		pizza.addTopping(new PizzaTopping("Bacon",2.00, true));				
	}
	
	public static void veggie(Pizza pizza)
	{
		pizza.setPizzaBase(new PizzaTopping("thin", 2.50, false));			
		pizza.addTopping(new PizzaTopping("Tomato Sauce",0.50, false));			
		pizza.addTopping(new PizzaTopping("Cheese",0.50, false));			
		pizza.addTopping(new PizzaTopping("Peppers",1.00, false));			
		pizza.addTopping(new PizzaTopping("Mushrooms",0.75, false));			
		pizza.addTopping(new PizzaTopping("Onions",0.75, false));			
		pizza.addTopping(new PizzaTopping("Sweetcorn",0.50, false));			
	}
	
	
	
}
