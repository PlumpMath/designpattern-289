package jp.ddo.bobchin.adapter;

public class Banner {

	private String string;

	public Banner(String string) {
		this.string = string;
	}

	public void showWithParen() {
		System.out.println(String.format("(%s)", this.string));
	}

	public void showWithAster() {
		System.out.println(String.format("*%s*", this.string));
	}
}
