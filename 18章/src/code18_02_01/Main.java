package code18_02_01;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args){
		FileWriter fw=null;

		try{
			fw=new FileWriter("data.txt");
			fw.write('そ');
			fw.write('れ');
			fw.write('で');
			fw.write('は');
		}catch(Exception e){
			System.out.println("何らかの例外が発生しました");
		}finally{
			if(fw!=null) {
				try {
				 fw.close();
				}catch(IOException e) {
					;
				}
			}
		}
	}

}
