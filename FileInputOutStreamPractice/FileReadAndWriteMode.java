package FileInputOutStreamPractice;

import java.io.File;

public class FileReadAndWriteMode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("c:test1.txt");
		
		//Make the file read only>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

		boolean flag = file.setReadOnly();
		
		if(flag == true)
		{
			System.out.println("File is read only!!!");
		}else
		{
			System.out.println("Operation is Failed!!!");
		}
		
		//Check weather the file is writable or not>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		if(file.canWrite()){
			System.out.println("File is Writable!!!");
		}
		else
		{
			System.out.println("File is Read Only!!!");
		}
		
		//Make the file writable>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		file.setWritable(true);
		
		if(file.canWrite()){
			System.out.println("File is Writable!!!");
		}
		else
		{
			System.out.println("File is Read Only!!!");
		}
		
	}

}
