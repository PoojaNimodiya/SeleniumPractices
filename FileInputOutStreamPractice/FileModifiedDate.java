package FileInputOutStreamPractice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileModifiedDate {

	public static void main(String[] args) throws IOException {
		{
		  
			//Specify the file path and name
			File file = new File("C:\\test1.txt");
			    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			System.out.println("Last Modified Date: " + sdf.format(file.lastModified()));
			
		}
	}
}