package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadText {

	public static void main(String[] args) throws IOException {
		 File file = new File("D:\\testing\\test.txt");
		 file.createNewFile();
		 
		 FileWriter a = new FileWriter("D:\\\\testing\\\\test.txt");
		 BufferedWriter out = new BufferedWriter(a);
		 out.write("Hello this is line 1....");
		 out.newLine();
		 out.write("Hello this is line 2....");
		 out.newLine();
		 out.flush();
		 
		 FileReader b = new FileReader("D:\\testing\\test.txt");
		 BufferedReader in = new BufferedReader(b);
		
		 String d;
		 int i=0;
		 while((d=in.readLine())!=null) {
			 
			 System.out.println(d);
			 i++;
		 }
		
		 System.out.println(i);
	}

}
