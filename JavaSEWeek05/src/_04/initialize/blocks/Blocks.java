package _04.initialize.blocks;

public class Blocks {

	static { 
		System.out.println("static initialize block! 1");
	} 
	
	static { 
		System.out.println("static initialize block! 2");
	} 
	
	{
		System.out.println("instance initialize block");
	}
	
	{
		System.out.println("instance initialize block 2");
	}
	
	Blocks() {
		//constructordan once calisir!
		System.out.println("constructor!");
	}
	
	
	public static void main(String[] args) {
		System.out.println("main!");
		
		Blocks object = new Blocks();
		
	}
	
	
}
