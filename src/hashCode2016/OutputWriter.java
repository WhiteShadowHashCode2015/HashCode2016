package hashCode2016;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class OutputWriter {

	public static void writeFile(String filename, GlobalData gd) throws FileNotFoundException{
		PrintWriter pw = new PrintWriter (new File(filename));


        pw.print("coucou");
        pw.print(" ");
        pw.print(gd.truc);
        pw.println();


		pw.close();
	}
	
}
