package jp.ddo.bobchin.bridge;

public class Main {

	public static void run() {
		Display d1 = new Display(new StringDiplayImpl("Hello, Japan."));
		Display d2 = new CountDisplay(new StringDiplayImpl("Hello, World."));
		CountDisplay d3 = new CountDisplay(new StringDiplayImpl("Hello, Univers."));

		d1.display();
		d2.display();
		d3.display();

		d3.multiDisplay(5);
	}

}
