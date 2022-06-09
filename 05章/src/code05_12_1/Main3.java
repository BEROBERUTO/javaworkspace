package code05_12_1;

public class Main3 {

	//値渡しのサンプル例
	public static void main(String[] args) {
		int x=100;
		int y=methodA(x);
		
		System.out.println(y);
	}

	public static int methodA(int x) {
		x+=500;
		return x;
	}
}
