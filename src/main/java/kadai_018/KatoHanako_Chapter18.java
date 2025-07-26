package kadai_018;

//加藤花子を表すクラス
public class KatoHanako_Chapter18 extends Kato_Chapter18 {

	//名を表すフィールドの値をセットする
	public void setGivenName() {
		this.givenName = "花子";
	}
	
	@Override
	//趣味は読書です、と出力する
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}
}
