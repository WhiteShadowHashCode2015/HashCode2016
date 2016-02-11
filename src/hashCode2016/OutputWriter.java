package hashCode2016;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import POC.Drone;
import POC.World;

public class OutputWriter {

	public static void writeFile(String filename, World gd) throws FileNotFoundException{
		PrintWriter pw = new PrintWriter (new File(filename));


        for (Drone d : gd.Drones){
            pw.print(d.GetCommands());
            pw.print("\n");
        }




		pw.close();
	}
	
}
