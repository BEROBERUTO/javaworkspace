package quizAns05_02;

public class Main {

	public static void main(String[] args) {
		email("金返せ","google","免許証見せろ、あくしろよ");
	}

	public static void email(String title,String address,String text) {
		System.out.println(address+"に、以下のメールを送信しました");
		System.out.println("件名:"+title);
		System.out.println("本文"+text);
	}


}
