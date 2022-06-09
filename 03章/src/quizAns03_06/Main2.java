package quizAns03_06;

public class Main2 {

	public static void main(String[] args) {
		System.out.println("【数あてゲーム】チャンスは5回までです。");
		int ans=new java.util.Random().nextInt(10);
		for(int i=0;i<5;i++) {
			System.out.println("画面に「0～9の数字を入力してください」");
			int num =new java.util.Scanner(System.in).nextInt();
			if(num==ans) {
				System.out.println("アタリ!");
				break;
			}else{
				System.out.println("違います");
				System.out.println((i+1)+"回目終了。残り"+(4-i)+"回目です。");
			}
		}

		System.out.println("ゲームを終了します");
	}

}
