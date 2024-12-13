package week5Assignment;

public class App {

	public static void main(String[] args) {
		
		Logger asterisk = new AsteriskLogger();
		
		System.out.print("4 a) ");
		asterisk.log("Hello");
		
		System.out.println("\n4 b) ");
		asterisk.error("Hello");

		Logger spaced = new SpacedLogger();
		
		System.out.println("\n5 a) ");
		spaced.log("Hello Mike");
		
		System.out.println("5 b) ");
		spaced.error("Hello Mike");
		
		
		
		
	
	}

}
