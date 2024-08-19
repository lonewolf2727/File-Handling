package FM_Example;

import java.io.FileWriter;
import java.io.IOException;

public class WritetoFile {

	public static void main(String[] args) {

		try {
			FileWriter fw=new FileWriter("C:\\Users\\Administrator\\Desktop\\Assignmnets\\Aditya.txt");
			fw.write("Hello  Aditya Sinha");
			fw.close();
			System.out.println("Successfully wrote to the file");
		} catch(IOException e)
		{
			System.out.println("An error occurred");
			e.printStackTrace();
		}

	}

}
