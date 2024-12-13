package week5Assignment;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		StringBuilder threeTimes = new StringBuilder();
		for (int i =0; i <= 3; i++) {
			threeTimes.append(log);
		} System.out.println("***" +threeTimes.toString() + "***");
		
		
	}

	@Override
	public void error(String error) {
		System.out.println("*****************");
		System.out.println("***ERROR:" + error + "***");
		System.out.println("*****************");
	}

}
