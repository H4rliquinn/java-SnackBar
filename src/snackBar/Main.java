package snackBar;

public class Main
{
	public static void main(String[] args)
	{

		Customer cust1=new Customer("Jane",45.25);
		Customer cust2=new Customer("Bob",33.14);



		System.out.println("***Snack Bar***");
		System.out.println();
		System.out.println(cust1);
		System.out.println(cust1.getName());
		System.out.println();	
	}
}