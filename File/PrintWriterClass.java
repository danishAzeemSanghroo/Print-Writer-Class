/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrintStreamClass;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Danish
 */
public class PrintWriterClass {
	public static void main(String args[])throws Exception{
		FileWriter w=new FileWriter("filename.txt");
		
		PrintWriter print=new PrintWriter(w);
     print.println();
     print.println(false);
     print.println('o');
     print.println("Ovais");
     print.println(11.10);
     print.println(11.65);
     print.println(111);
     print.println(33L);
     
     System.in.read();
     print.println("Flush method invoked");
		print.flush();
		//print.close();    
        }
}
