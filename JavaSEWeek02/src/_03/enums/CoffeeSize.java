package _03.enums;

public enum CoffeeSize {
	SHORT(5), TALL(7), GRANDE(8), VENTI(10);
	
	private int price;
	//Illegal modifier for the enum constructor; only private is permitted.
	private CoffeeSize(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
}
