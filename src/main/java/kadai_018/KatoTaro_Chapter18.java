package kadai_018;

//加藤太郎を表すクラス
public class KatoTaro_Chapter18 extends Kato_Chapter18{

	//名を表すフィールドの値をセットする
	public void setGivenName() {
		this.givenName = "太郎";
	}
	
	@Override
	//私はJavaが得意です、と出力する
	public void eachIntroduce() {
		System.out.println("Javaが得意です");	
	}
}
