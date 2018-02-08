package FileInputOutStreamPractice;

import java.io.File;

public class FileRename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File oldfile = new File("c:test1.txt");
		File newfile = new File("c:pooja.txt");

		
		boolean renameFile = oldfile.renameTo(newfile);
		 if(renameFile == true)
		 {
			 System.out.println("File Renamed Successfully!!!");
		 }else
		 {
			 System.out.println("File Renamed Failed!!!");
		 }
	}

}
