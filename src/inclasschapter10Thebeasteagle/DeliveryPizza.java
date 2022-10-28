package inclasschapter10Thebeasteagle;

public class DeliveryPizza {
	
	private String address;
	private double deliveryFee;
	private final int Low = 3;
	private final int High = 5;
	private final int CUTOFFPRICE = 15;
	
	DeliveryPizza(String desc, double pr, String address)
	{
		super(desc, pr);
		this.address = address;
		if(pr > CUTOFFPRICE)
			deliveryFee = Low;
		else
			deliveryFee = High;
	}
	public void display();
	System.out.println(" Deliver to: " + address + ". Fee is " + deliveryFee);
	

}
