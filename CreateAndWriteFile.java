package week_7;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateAndWriteFile {

	public static void main(String[] args) {
		try
		{
			File file = new File("newFile.txt");
			
			if(!file.exists())
			{
				file.createNewFile();
			}
			
			PrintWriter pw = new PrintWriter(file);
			pw.println("aaaabbbbcccccddddddeeee");
			pw.println(234213576);
			pw.close();
			System.out.println("Done");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
