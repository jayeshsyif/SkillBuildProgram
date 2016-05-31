package files.example;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead{

	public static void main(String args[])throws IOException{

		File file = new File("C:\\Users\\102631\\Desktop\\Hello1.txt");
		// creates the file
		file.createNewFile();
		// creates a FileWriter Object
		FileWriter writer = new FileWriter(file); 
		// Writes the content to the file
		writer.write("This\n is\n an\n example\n"); 
		writer.flush();
		writer.close();

		//Creates a FileReader Object
		FileReader fr = new FileReader(file); 
		BufferedReader br = new BufferedReader(fr);
		String s ="";
		String str = "";
		do{
			str = br.readLine();
			if(str != null)
				s = s + str;
		}while(str != null);

		System.out.println(s);
		br.close();
		fr.close();
	}
}