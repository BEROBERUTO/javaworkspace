package quizAns15_03_01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		String[] pattern = {".*","A\\d{1,2}","U[A-Z]{3}"};
		String[] checkObj = {"100","A10","UKGB"} ;

		for(int i = 0; i<3; i++) {
			Pattern pat = Pattern.compile(pattern[i]);
			String Obj = checkObj[i];
	        Matcher matcher = pat.matcher(Obj);
	        if (matcher.find()) {
	            System.out.println("正規表現にマッチしました。");
	        } else {
	            System.out.println("マッチしませんでした。");
	        }
		}
	}

}
