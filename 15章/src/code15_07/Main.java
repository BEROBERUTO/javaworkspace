package code15_07;

public class Main {

	public static void main(String[] args) {
		String s="abc,def:ghi";
		String[] word=s.split("[,:]");

		for(String w:word) {
			System.out.print(w+"->");
		}
	}

}
