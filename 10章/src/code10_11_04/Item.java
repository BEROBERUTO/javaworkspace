package code10_11_04;

public class Item {
	String name;
	int price;

	public Item(String name) {
		this.name=name;
		this.price=0;
		System.out.println("Itemの引数1つのコンストラクタ");
			}

	public Item(String name,int price) {
		this.name=name;
		this.price=price;
	}

}
