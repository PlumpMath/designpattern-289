package jp.ddo.bobchin.bridge;

public class StringDiplayImpl extends DisplayImpl {

	private String string;
	private int width;

	public StringDiplayImpl(String string) {
		this.string = string;
		this.width = string.getBytes().length;
	}

	@Override
	public void rawOpen() {
		printLine();
	}

	@Override
	public void rawPrint() {
		System.out.println(String.format("|%s|", this.string));
	}

	@Override
	public void rawClose() {
		printLine();
	}

	private void printLine() {
		System.out.print("+");

		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}

		System.out.println("+");
	}
}
