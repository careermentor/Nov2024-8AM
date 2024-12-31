package basicjava;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class FileHandling 
{
	public static void readProp() throws Exception
	{
		FileReader fr = new FileReader("./TestData/test.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("Automation"));
		System.out.println(prop.get("Langauage"));
		
	}
	

	public static void readdata() throws Exception
	{
		File f = new File("C:\\TestData\\data1.txt");  //file connection
		
		FileReader fr = new FileReader(f);
		
		int r = fr.read();  //84
		
		
		
		while(r!=-1)  //84!=-1, 101!=-1
		{
			System.out.print((char)r);  //Th
			r = fr.read();
		}
		
	}
		public static void writedata() throws Exception
		{
			File f = new File("C:\\TestData\\data5.txt");  //file connection
			FileWriter fw =new FileWriter(f,true);
			
			fw.write("\nThis is forth line of code");
			fw.flush(); //save
			fw.close();
		}
		
		
	
	
	public static void main(String[] args) throws Exception {
		writedata();
		readProp();
		
	}
	
}
