package ex11_02;

public abstract class TangibleAsset extends Asset{
	String color;

	//コンストラクタ
	public TangibleAsset(String name,int price,String color) {
		super(name,price);
		this.color=color;
	}

	//メソッド
	public String getColor() {return this.color;}

}

