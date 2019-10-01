package snackBar;

public class Snack
{
	private static int maxId=0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	public Snack(String name,int quantity,double cost,int vendingMachineId)
	{
	 maxId++;
	 this.id=maxId;
	 this.name=name;
	 this.quantity=quantity;
	 this.cost=cost;
	 this.vendingMachineId=vendingMachineId;
	}

	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}

	public double getCost()
	{
		return cost;
	}
	public void setCost(double cost)
	{
		this.cost=cost;
	}

	public int getVendingMachineId()
	{
		return vendingMachineId;
	}
	public void setVendingMachineId(int vendingMachineId)
	{
		this.vendingMachineId=vendingMachineId;
	}
		public int getQuantity()
	{
		return quantity;
	}
	public void addQuantity(int amount)
	{
		quantity=quantity+amount;
	}
	public void buySnack(int amount)
	{
		quantity=quantity-amount;
	}
	public double getTotalCost(int quantity)
	{
		return quantity*cost;
	}
}