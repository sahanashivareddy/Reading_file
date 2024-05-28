package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class demo {
public static void main(String[] args) throws Exception {
	File file=new File("/home/dell/Documents/myfile");
	if(file.renameTo(new File("/home/dell/Desktop/sample")))
	{
		file.delete();
		System.out.println("file moved");
	    file=new File("/home/dell/Desktop/sample");
	    FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String s1 = bufferedReader.readLine();
		while (s1 != null) {
			System.out.println(s1);
			s1 = bufferedReader.readLine();
		}
	}else {
		System.out.println("file is not moved");
	}
}
}
