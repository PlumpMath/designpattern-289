package jp.ddo.bobchin.strategy;

public class Hand {

	public static final int HANDVALUE_GUU = 0;
	public static final int HANDVALUE_CHO = 1;
	public static final int HANDVALUE_PAA = 2;

	public static final Hand[] hand = {
		new Hand(HANDVALUE_GUU),
		new Hand(HANDVALUE_CHO),
		new Hand(HANDVALUE_PAA)
	};

	private static final String[] name = {
		"グー", "チョキ", "パー"
	};

	private int handvalue;

	private Hand(int handvalue) {
		this.handvalue = handvalue;
	}

	public static Hand getHand(int handvalue) {
		return hand[handvalue];
	}

	// 自分の方が強いかどうか
	public boolean isStrongerThan(Hand h) {
		return fight(h) == 1;
	}

	// 自分の方が弱いかどうか
	public boolean isWeakerThan(Hand h) {
		return fight(h) == -1;
	}

	private int fight(Hand h) {
		if (this == h) {
			// あいこ
			return 0;
		} else if ((this.handvalue + 1) % 3 == h.handvalue) {
			// 自分の勝ち
			return 1;
		} else {
			// 自分の負け
			return -1;
		}
	}

	public String toString() {
		return name[handvalue];
	}
}
