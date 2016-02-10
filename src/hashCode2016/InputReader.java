package hashCode2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InputReader {

	public static GlobalData readFile(String filePath) throws FileNotFoundException{
		 
		Scanner scanner= new Scanner(new File(filePath));
		 
		GlobalData gd = new GlobalData();
		
			//Read global informations
		    gd.truc = scanner.nextInt();

		    
		scanner.close();
		return gd;
	}
	
}
