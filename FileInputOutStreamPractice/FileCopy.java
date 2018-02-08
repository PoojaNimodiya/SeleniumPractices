package FileInputOutStreamPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		
		File infile = new File("c:test1.txt");
		File outfile = new File("c:test.txt");
		
		try {
			fis = new FileInputStream(infile);
			fos = new FileOutputStream(outfile);
					
			byte[] buffer = new byte[1024];
			
			int length;
			while ((length = fis.read(buffer)) >0) {
					fos.write(buffer,0,length);
			}
			
			fis.close();
			fos.close();
			
			System.out.println("File Copied Successfully!!!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
