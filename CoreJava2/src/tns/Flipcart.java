package tns;
interface Product {
	 String getName();
	 double getPrice();
}
public class Flipcart implements Product {
	private String name;
	private double price ;
	public Flipcart(String name,double price)
	{
		this.name=name;
		this.price=price;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
}
	