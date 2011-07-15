package jp.ddo.bobchin.adapter;

public class Main {
	public static void run() {
		Print p = new PrintBanner("Adaptor");
		p.printWeak();
		p.printStrong();
	}
}
