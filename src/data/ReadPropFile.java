package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f = new FileInputStream("D:\\testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		System.out.println(prop.getProperty("name"));
		prop.setProperty("pin", "m1t1x1");
		
		FileOutputStream out = new FileOutputStream("D:\\\\testing\\\\prop.properties");
		prop.store(out, "add this");
	}

}
