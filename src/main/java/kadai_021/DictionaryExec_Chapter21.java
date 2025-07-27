package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		//辞書クラスのインスタンスを作成する
		Dictionary_Chapter21  dc = new Dictionary_Chapter21();
		
		//調べる英単語を配列にセットする
		String[] englishWord = 	{"apple", "banana", "grape", "orange"};
		
		dc.dictionarySearch(englishWord);
		
	}
}
