package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	//自分のじゃんけんの手を入力する
	@SuppressWarnings("resource")
	public String getMyChoice() {
		//自分のじゃんけんの手を入力する
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		Scanner scanner = new Scanner(System.in);

		//正しいじゃんけんの手であるか判定する
		String myChoice = scanner.next();
		//
		if (myChoice.equals("r") || myChoice.equals("c") || myChoice.equals("p")) {
			scanner.close();
		} else {
			System.out.println("エラー：正しいじゃんけんの手ではありません。再度自分のじゃんけんの手を選んでください");
			return getMyChoice();
		}
		return myChoice;
	}

	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRamdom() {
		//配列にじゃんけんの値をセットする
		String[] choice = { "r", "c", "p" };

		//乱数で対戦相手のじゃんけんの値を選ぶ
		int computerChoice = (int) Math.floor(Math.random() * 3);
		String computerHand = choice[computerChoice];

		//じゃんけんクラスを実行するクラスに、対戦相手のじゃんけんの値を返す
		return computerHand;

	}

	//じゃんけんを行う
	public void playGame(String myHand) {
		//自分と相手のじゃんけんの手を出力する
		HashMap<String, String> hands = new HashMap<String, String>();
		hands.put("r", "グー");
		hands.put("c", "チョキ");
		hands.put("p", "パー");
		String computerHand = getRamdom();
		System.out.println("自分の手は" + hands.get(myHand) + ",対戦相手の手は" + hands.get(computerHand));

		//自分と相手のじゃんけんの手を比較する
		if ((myHand.equals("r") && computerHand.equals("c"))
				|| (myHand.equals("c") && computerHand.equals("p"))
				|| (myHand.equals("p") && computerHand.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else if (myHand.equals(computerHand)) {
			System.out.println("あいこです");
		} else {
			System.out.println("自分の負けです");
		}
	}
}
