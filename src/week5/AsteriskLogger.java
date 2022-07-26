package week5;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		System.out.println("***" + log + "***");
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		String toPrint = "Error: " + error;
		int totalLength = toPrint.length() + 6;
		astrisk(totalLength);
		System.out.println("\n" + "***" + toPrint + "***");
		astrisk(totalLength);

	}

	private void astrisk(int count) {
		for (int i = 0; i < count; i++) {
			System.out.print("*");
		}
	}
}