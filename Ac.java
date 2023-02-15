package ac;

public class Ac {
	private String brand;
	private int price;
	private Inverter inverter;
	
	public void SetBrand(String brand) {
		this.brand=brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public void setInverter(Inverter inverter) {
		this.inverter=inverter;
	}
	public Inverter getInverter() {
		return inverter;
	}
	public Ac(String brand, int price, Inverter inverter) {
		this.brand=brand;
		this.price=price;
		this.inverter=inverter;
	}
	public String toString() {
		return "Brand= "+brand+", Price= "+price+", Inverter= "+inverter;
	}

}
