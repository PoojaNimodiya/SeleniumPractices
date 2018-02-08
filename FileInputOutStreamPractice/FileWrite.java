package FileInputOutStreamPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file;
		FileOutputStream fos = null;
	    String content = "Hay, Please write this data in file. Thank You!!";
				
		try {
			file = new File("c:test1C.txt");
			fos = new FileOutputStream(file);
			
			if(file.exists() == false){
				
				file.createNewFile();
				System.out.println("File not Exist. Creating the new file....");

			}
			
			byte[] byteArray = content.getBytes();
			
			fos.write(byteArray);
			fos.flush();
			System.out.println("File Written Successfull!!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try{
				if(fos != null){
				fos.close();
				}
			}
				catch (Exception e2) {
					// TODO: handle exception
				
			}
		}
	}

}
