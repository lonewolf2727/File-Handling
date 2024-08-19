package FM_Example;

import java.io.File;
import java.io.IOException;

public class DeleteFile {

	public static void main(String[] args) {

			File obj = new File("C:\\Users\\Administrator\\Desktop\\Assignmnets\\AdityaKumarSinha.xlsx");
			
			if(obj.delete()) {
				System.out.println("Deleted the file:"+obj.getName());
			}
			else {
				System.out.println("FIle is not found");
			}
	}
}
