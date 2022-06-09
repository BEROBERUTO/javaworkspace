package quizAns05_02;

public class Main2 {

	public static void main(String[] args) {
		String title="金返せ";
		String address="google";
		String text="免許証見せろ、あくしろよ";
		email(title,address,text);
	}

	public static void email(String title,String address,String text) {
		System.out.println(address+"に、以下のメールを送信しました");
		System.out.println("件名:"+title);
		System.out.println("本文"+text);
	}


}
