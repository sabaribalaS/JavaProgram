package javaarraylist;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file_obj = new File("/home/sabari/Downloads/sabaribala.txt");
//	System.out.println(file_obj.createNewFile());
//	System.out.println(file_obj.exists());
//	System.out.println(file_obj.lastModified());
//	Date dd = new Date(file_obj.lastModified()); 
//	System.out.println(dd);i
//	System.out.println(dd.getDay());
//	File filefolder = new File("/home/sabari/Downloads/balaji/arunkumar/ashwini");
//	System.out.println(filefolder.isDirectory());
//	System.out.println(filefolder.isFile());
//	System.out.println(filefolder.getName());
//	System.out.println(filefolder.mkdirs());
////	System.out.println(filefolder.isDirectory());
	FileWriter pen = new FileWriter(file_obj,true);
//	pen.write("ybr ");
//	pen.write("sabaribala ");
//	pen.write("stalin ");
//	pen.flush();
//	pen.close();
	
	
	
//	BufferedWriter buff = new BufferedWriiter(pen);
//	buff.newLine();
//	buff.write("ajitha ");
//	buff.newLine();
//	buff.write("sabaribala");
//	buff.newLine();
//	buff.write("ybr");
//	buff.newLine();
//	buff.flush();
//	buff.close();
//	
//	
//	
	File file = new File("/home/sabari/Downloads/sabaribala.txt");

	FileReader reader = new FileReader(file);
	int i =reader.read();
	while(i!=-1) {
	char ch = (char)i;
	System.out.print(ch);
	 i =reader.read();
	
	
	}
	
	FileReader reader = new FileReader(file);
	 BufferedReader bufReader =readLine  new BufferedReader(reader);
	 String j = bufReader();
	 while(j!=null)
	 {
	 System.out.println(j);
	 j = bufReader.readLine();
	 }
	
//	 FileReader reader = new FileReader(file);
//	  BufferedReader bufReader = new BufferedReader(reader);
	  String i = bufReader.readLine();
	  int no_of_lines = 0; 
	  int no_of_letters =0;
	  while(i!=null)
	  {
	  System.out.println(i + " " + i.length());
	  no_of_letters = no_of_letters + i.length();
	  i = bufReader.readLine();
	  no_of_lines++; 
	  }
	System.out.println(no_of_lines);
	System.out.println(no_of_letters);
	

	}

}
