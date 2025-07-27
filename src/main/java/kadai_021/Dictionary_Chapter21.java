package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	private HashMap<String,String> englishWords = new HashMap<String,String>();
		
	public Dictionary_Chapter21() {
			englishWords.put("apple","りんご");
			englishWords.put("peach", "桃");
			englishWords.put("banana", "バナナ");
			englishWords.put("lemon", "レモン");
			englishWords.put("pear", "梨");
			englishWords.put("kiwi", "キウィ");
			englishWords.put("strawberry", "いちご");
			englishWords.put("grape", "ぶどう");
			englishWords.put("muscat", "マスカット");
			englishWords.put("cherry", "さくらんぼ");
		}
		
	//調べる英単語が辞書に追加されているか判定
	public void dictionarySearch (String[] words) {
			for(String word: words) {
				if(englishWords.containsKey(word)) {
					System.out.println(word + "の意味は" + englishWords.get(word));
				}else {
					System.out.println(word + "は辞書に存在しません" );
				}
			}
		}
	
}
