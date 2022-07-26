package week5;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger logger = new AsteriskLogger(); 
		Logger logger1 = new SpacedLogger();
		
		logger.log("Hello");
		System.out.println();
		logger.error("hi");
		System.out.println();
		logger1.log("Hey");
		System.out.println();
		logger1.error("okay");
	
	}

}
