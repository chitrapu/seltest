package test;

public class BlocksInJavaClass {
	
	
	
	public BlocksInJavaClass() {
		
		System.out.println("Constructor Block");
	}
	
	
	{
	
		System.out.println("instance Block");
		
	}
	
	
	static {
		
		System.out.println("Static block");
	}

	
	public static void main(String[] args) {
		
		BlocksInJavaClass A = new BlocksInJavaClass();
		
	}
	
}
