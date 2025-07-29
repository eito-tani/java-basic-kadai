package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		//じゃんけんクラスのインスタンスを生成する
		Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();

		String myHand = jyanken.getMyChoice();

		//じゃんけんの手を出力する
		jyanken.playGame(myHand);

	}

}
