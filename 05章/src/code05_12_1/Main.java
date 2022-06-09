package code05_12_1;

public class Main {

	//値渡しのサンプル例
	public static void main(String[] args) {
		int x=100;
		methodA(x);
		System.out.println(x);
	}
	public static void methodA(int x) {
		x+=500;
	}
}
