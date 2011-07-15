package jp.ddo.bobchin;

import java.util.Random;

public class Run {

	public static void main(String[] args) {
		if (args.length < 1) return;

		if (args[0].toUpperCase().equals("ADAPTOR")) {
			jp.ddo.bobchin.adapter.Main.run();
		} else if (args[0].toUpperCase().equals("ADAPTOR2")) {
			jp.ddo.bobchin.adapter2.Main.run();
		} else if (args[0].toUpperCase().equals("BRIDGE")) {
			jp.ddo.bobchin.bridge.Main.run();
		} else if (args[0].toUpperCase().equals("DECORATOR")) {
			jp.ddo.bobchin.decorator.Main.run();
		} else if (args[0].toUpperCase().equals("STRATEGY")) {
			Random r = new Random();
			jp.ddo.bobchin.strategy.Main.run(r.nextInt(), r.nextInt(), 10000);
		} else if (args[0].toUpperCase().equals("COMPOSITE")) {
			jp.ddo.bobchin.composite.Main.run();
		}
	}

}
