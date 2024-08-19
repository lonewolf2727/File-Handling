package FM_Example;

import java.io.File;
import java.io.IOException;

public class CreareFileDr {

	public static void main(String[] args) {
		try {
			File obj = new File("C:\\Users\\Administrator\\Desktop\\Assignmnets\\AdityaKumarSinha.xlsx");
			
			if(obj.createNewFile()) {
				System.out.println("File created : "+obj.getName());
				System.out.println("Absolute path: "+obj.getAbsolutePath());
			}else {
				System.out.println("FIle already exists.");
			}
		} catch(IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}

	}

}
