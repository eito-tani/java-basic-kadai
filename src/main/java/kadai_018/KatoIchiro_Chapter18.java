package kadai_018;

//加藤一郎を表すクラス
public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

    public KatoIchiro_Chapter18() {
        setGivenName();
    }
    
	//名を表すフィールドの値をセットする
	public void setGivenName() {
		this.givenName = "一郎";
	}
	
	@Override
	//好きな食べ物はリンゴです、と出力する
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}

}
