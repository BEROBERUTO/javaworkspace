package code05_13;

public class Main2 {
	//int型配列を受けとり、配列内の要素すべてに1を加えるメソッド
	public static void incArray(int[]Array) {
		for(int i=0;i<Array.length;i++) {
			Array[i]++;
		}
	}


	public static void main(String[] args) {
		int[]array= {1,2,3};
		incArray(array);
		for(int i:array) {
			System.out.println(i);
		}
	}

}
