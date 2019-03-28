package _03.enums;

public class EnumTest02 {

	public static void main(String[] args) {
		CoffeeSize grande = CoffeeSize.GRANDE;
		System.out.println(grande);
		System.out.println(grande.getPrice());
		System.out.println(grande.ordinal());
		
		//
		
		CoffeeSize grande2 = CoffeeSize.GRANDE;
		
		//enumlari kontrol ederken == kullanabiliriz!!!
		System.out.println(grande == grande2);
		System.out.println(grande.equals(grande2));
		//
		
		for(CoffeeSize e : CoffeeSize.values()){
			System.out.println(e +" : "+ e.getPrice());
		}
	}
}
