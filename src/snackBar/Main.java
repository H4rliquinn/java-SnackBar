package snackBar;
import java.text.NumberFormat;
import java.util.Locale;

public class Main
{
	public static void main(String[] args)
	{
		//Objects
		Customer cust1=new Customer("Jane",45.25);
		Customer cust2=new Customer("Bob",33.14);

		VendingMachine vm1=new VendingMachine("Food");
		VendingMachine vm2=new VendingMachine("Drink");
		VendingMachine vm3=new VendingMachine("Office");

		Snack snack1=new Snack("Chips",36,1.75,vm1.getId());
		Snack snack2=new Snack("Choc. Bar",36,1.00,vm1.getId());
		Snack snack3=new Snack("Pretzel",30,2.00,vm1.getId());
		Snack snack4=new Snack("Soda",24,2.50,vm2.getId());
		Snack snack5=new Snack("Water",20,2.75,vm2.getId());

		NumberFormat format=NumberFormat.getCurrencyInstance(Locale.US);

		//Processing
				System.out.println("***Snack Bar***");
				System.out.println();
		//Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
		System.out.println("Name: "+cust1.getName()+"\tCash: $"+format.format(cust1.getCashOnHand())+"\tSnack: "+snack4.getName()+": "+snack4.getQuantity());
		customerBuy(3,cust1,snack4);
		System.out.println("Name: "+cust1.getName()+"\tCash: $"+format.format(cust1.getCashOnHand())+"\tSnack: "+snack4.getName()+": "+snack4.getQuantity());
		System.out.println();
		//Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
		customerBuy(1,cust1,snack3);
		System.out.println("Name: "+cust1.getName()+"\tCash: "+format.format(cust1.getCashOnHand())+"\tSnack: "+snack3.getName()+": "+snack3.getQuantity());
		System.out.println();		
		//Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
		System.out.println("Name: "+cust2.getName()+"\tCash: "+format.format(cust2.getCashOnHand())+"\tSnack: "+snack4.getName()+": "+snack4.getQuantity());
		customerBuy(2,cust2,snack4);
		System.out.println("Name: "+cust2.getName()+"\tCash: "+format.format(cust2.getCashOnHand())+"\tSnack: "+snack4.getName()+": "+snack4.getQuantity());
		System.out.println();		
		//Customer 1 finds $10. Print Customer 1 Cash on Hand.
		cust1.addCash(10);
		System.out.println("Name: "+cust1.getName()+"\tCash: "+format.format(cust1.getCashOnHand()));
		System.out.println();		
		//Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
		customerBuy(1,cust1,snack2);
		System.out.println("Name: "+cust1.getName()+"\tCash: "+format.format(cust1.getCashOnHand())+"\tSnack: "+snack2.getName()+": "+snack2.getQuantity());
		System.out.println();
		//Add 12 more items to snack 3. Print quantity of snack 3.
		snack3.addQuantity(12);
		System.out.println("Name: "+snack3.getName()+"\tQuantity: "+snack3.getQuantity());
		System.out.println();
		//Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.
		customerBuy(3,cust2,snack3);
		System.out.println("Name: "+cust2.getName()+"\tCash: "+format.format(cust2.getCashOnHand())+"\tSnack: "+snack3.getName()+": "+snack3.getQuantity());
		System.out.println();
		//Snack Inventory

		
		System.out.println("***Snack Inventory***");
		System.out.println();
		System.out.println("Name: "+snack1.getName()+"\tVM: "+vm1.getName()+"\tQuantity: "+snack1.getQuantity()+"\tTotal Cost: "+format.format(snack1.getTotalCost(snack1.getQuantity())));
		System.out.println("Name: "+snack2.getName()+"\tVM: "+vm1.getName()+"\tQuantity: "+snack2.getQuantity()+"\tTotal Cost: "+format.format(snack2.getTotalCost(snack2.getQuantity())));
		System.out.println("Name: "+snack3.getName()+"\tVM: "+vm1.getName()+"\tQuantity: "+snack3.getQuantity()+"\tTotal Cost: "+format.format(snack3.getTotalCost(snack3.getQuantity())));
		System.out.println("Name: "+snack4.getName()+"\tVM: "+vm2.getName()+"\tQuantity: "+snack4.getQuantity()+"\tTotal Cost: "+format.format(snack4.getTotalCost(snack4.getQuantity())));	
		System.out.println("Name: "+snack5.getName()+"\tVM: "+vm2.getName()+"\tQuantity: "+snack5.getQuantity()+"\tTotal Cost: "+format.format(snack5.getTotalCost(snack5.getQuantity())));

	}
	
	public static void customerBuy(int quantity,Customer customer,Snack snack)
	{
		double cash=customer.getCashOnHand();
		if (cash>snack.getTotalCost(quantity))
		{
			customer.buy(snack.getTotalCost(quantity));
			snack.buySnack(quantity);
		} else {
			System.out.println("Snack Too Expensive");
		}
	}
}