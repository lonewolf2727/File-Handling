package FM_Example;

import java.io.File;

public class GetFileInformation {

	public static void main(String[] args) {
		
		File obj = new File("C:\\Users\\Administrator\\Desktop\\Assignmnets\\Assignment.xlsx");
		if(obj.exists()) {
			System.out.println("File name : "+obj.getName());
			System.out.println("Absolute path : "+obj.getAbsolutePath());
			System.out.println("Writable:"+obj.canWrite());
			System.out.println("Readable:"+obj.canRead());
			System.out.println("FIle size in bytes "+obj.length());
		}
		else{
			System.out.println("This file does not exist.");
		}
	}

}
