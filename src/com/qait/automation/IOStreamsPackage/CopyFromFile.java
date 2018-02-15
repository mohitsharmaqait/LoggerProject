package com.qait.automation.IOStreamsPackage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileInputStream;

/* Write a program which reads data from file and copy all the occuring email id,number from that file to a new file. The program should also log the line number where that email id or number occurred in the given file.
In the end, it should also log the frequency/count of the number and email id.
 */

public class CopyFromFile {

	private static final Logger logger =Logger.getLogger(Logger.class.getName());

	public static void main(String args[]) throws IOException {  
  		FileReader in = null; FileWriter out = null;
  		try {
     			in = new FileReader("Filess//input.txt");
     			out = new FileWriter("Filess//output.txt");         
     			int c;
     			while ((c = in.read()) != -1) {
        			out.write(c);
        			//logger.log(Level.INFO, " Data copied !!");
     			}
  		} finally {
     			if (in != null)
        			in.close();
     			if (out != null)
        			out.close();
     			System.out.println("Done");
  		}
	}
}
