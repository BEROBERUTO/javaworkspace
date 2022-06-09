package code05_12;

public class Main2 {
	//int型配列を受け取り、すべての要素を表示するメソッド
	public static void printArray(int[]Array) {
		for(int element:Array) {
			System.out.println(element);
		}

	}

	public static void main(String[] args) {
		int[]array= {1,2,3};
		printArray(array);	//配列を渡す
	}

}
