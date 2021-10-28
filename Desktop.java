package week3.day1Assignments;

public class Desktop extends Computer {

	public void desktopSize()

	{
		System.out.println("HP Gaming LAP size -14 inches");
		System.out.println("Mirosoft Gaming LAP size - 16 inches");
		System.out.println("Dell Gaming LAP size = 13.5 inches");
		System.out.println("Lenovo Gaming LAP size = 14 inches");

	}

	public static void main(String[] args) {
		Desktop dew = new Desktop();
		dew.computerModel();
		dew.desktopSize();
		dew.computerHardware();
	}
}
