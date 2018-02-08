package FileInputOutStreamPractice;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo
{
   public static void main( String[] args ) throws IOException
   {	
	   File file = new File("c:test.txt");
	 
	   try{
		   if(file.createNewFile()){
			   System.out.println("Hay Thanks For Creating the File....");
		   }else{
			   System.out.println("File Already Exist....");
 
		   }
	   }
	   catch(IOException e){
		   e.printStackTrace();
	   }
   }
}