package quizAns05_03;

public class Main2 {

	public static void main(String[] args) {
		String title="金返せ";
		String address="google";
		String text="免許証見せろ、あくしろよ";
		email(address,text);
	}

	public static void email(String title,String address,String text) {
		System.out.println(address+"に、以下のメールを送信しました");
		System.out.println("件名:"+title);
		System.out.println("本文"+text);
	}

	public static void email(String address,String text) {
		System.out.println(address+"に、以下のメールを送信しました");
		System.out.println("件名:無題");
		System.out.println("本文:"+text);
	}


}
