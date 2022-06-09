package code18_01_01;

import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		try(FileReader fr=new FileReader("data.txt");){
		int input=fr.read();
			while(input!=-1){
			System.out.println((char)input);
			input=fr.read();
			}
		}catch(Exception e){
			System.out.println("何らかの例外が発生しました");
		}

	}

}
