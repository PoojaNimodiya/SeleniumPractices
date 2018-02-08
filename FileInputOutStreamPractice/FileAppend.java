package FileInputOutStreamPractice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file;
		String content = "Hay, Please append this code in the respective file. Thank You";
			
		try {
			file = new File("c:test1.txt");
			FileWriter fw = new FileWriter(file,true);
			
			if(!file.exists()){
				file.createNewFile();
			}
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(content);
			
			bw.close();
			
			System.out.println("File Append completed successfully!!!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
