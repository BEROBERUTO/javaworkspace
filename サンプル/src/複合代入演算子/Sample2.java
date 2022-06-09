package 複合代入演算子;

public class Sample2 {

		public static void main(String[] args) {
			int num = 3;
			num = num + 2.2;
			//numはint型変数、右辺はdouble型になるので
			//double型はint型変数には入れられない(p78-p82)
			System.out.println(num);

	}

}
