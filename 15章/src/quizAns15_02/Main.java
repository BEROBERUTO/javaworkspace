package quizAns15_02;

public class Main {

	public static void main(String[] args) {
		String path1=concatPath("c:\\javadev","readme.text");
		String path2=concatPath("c:\\user\\","readme.text");
		System.out.println(path1);
		System.out.println(path2);
	}

	public static String concatPath(String folder,String file) {
		if(!folder.endsWith("\\")) {
			folder+="\\";
		}
		return folder+file;
	}



}
