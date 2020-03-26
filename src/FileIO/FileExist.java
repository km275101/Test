package FileIO;

import java.io.File;
import java.io.IOException;

public class FileExist {
	
	public static void main(String args[]) throws IOException {
		
		File f = new File("C:\\Users\\kamlesh.maurya\\Desktop\\Jmeter\\abc.txt");
		//f.createNewFile();
		f.mkdir();
		System.out.println(f.exists());
	}

}
