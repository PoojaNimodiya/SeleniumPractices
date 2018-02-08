package FileInputOutStreamPractice;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("c:test11.txt");
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			if(file.createNewFile()){
				System.out.println("File Created....");
			}else{
				System.out.println("File Already Exist....");
			}
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			while(bis.available() >0)
			{
				System.out.println((char)bis.read());
			}
		} 
		catch (FileNotFoundException fnfe) {
			System.out.println("File Not Found:::" +fnfe);
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try{
				if(fis !=null && bis!= null){
					fis.close();
					bis.close();
				}
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error in input stream::" +e);
			}
		}
		
		

	}

}
