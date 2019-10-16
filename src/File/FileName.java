package File;

import java.io.File;

public class FileName {
	
	public static void main(String args[]){
		File f = new File("C:\\Hello\\AnotherFolder\\The File Name.PDF");
		System.out.println(f.getName());
		
		System.out.println(f.getAbsolutePath().substring(f.getAbsolutePath().lastIndexOf("\\")+1));
	}

}
