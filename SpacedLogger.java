package week5Assignment;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		
		//System.out.println(log.replace("", " "));
		
		StringBuilder letters = new StringBuilder();
		for (int i=0; i < log.length(); i++) {
			letters.append(log.charAt(i)+" ");
		} System.out.println(letters.toString());
							
//		char [] letters = new char[log.length()];  // another way but StringBuilder way seemed easier
//		for (int i=0; i< log.length(); i++) {
//			letters[i] = log.charAt(i); 
//		} 
//		
//		for (char letter : letters) {
//			System.out.print(letter +" ");
//		}
		
		
}

	
	@Override
	public void error(String error) {
		StringBuilder letters = new StringBuilder();
		for (int i=0; i < error.length(); i++) {
			letters.append(error.charAt(i)+" ");
		} System.out.println("ERROR: "+ letters.toString());
		
	}

}
