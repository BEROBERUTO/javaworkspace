package code03_03_01;

public class Main {

	//p108スコープに関するサンプルコード
	public static void main(String[] args) {
		String mainMsg ="変数「mainMsg」はメインメソッドで定義済み";
		System.out.println(mainMsg);

		boolean tenki = false;
		if(tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩にいきます");

			String trueMsg = "真の場合のメッセージです";
			mainMsg = "真の場合の中で上書きされた文";


		}else {
			System.out.println("DVDを見ます");

			String falseMsg = "偽の場合のメッセージです";
			System.out.println(falseMsg);
			//System.out.println(trueMsg);//真の場合の中で定義された変数は使えない

			mainMsg = "偽の場合の中で上書きされた文";

		}
		//System.out.println(trueMsg);//真の場合の中で定義された変数は使えない
		System.out.println(mainMsg);
	}

}
