package hashCode2016;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import POC.World;

public class OutputWriter {

	public static void writeFile(String filename, World gd) throws FileNotFoundException{
		PrintWriter pw = new PrintWriter (new File(filename));


        pw.print("coucou");
        pw.print(" ");
        pw.println();


		pw.close();
	}
	
}
