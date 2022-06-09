package 複合代入演算子;

public class Sample4 {

	public static void main(String[] args) {
		int num = 3;

		num += 2.2;
		//複合代入演算子は「演算」と「代入」と「キャスト」をしている
		//num = (int)(num + 2.2)
		//num = (int)(3.0 + 2.2)

		System.out.println(num);
	}

}
