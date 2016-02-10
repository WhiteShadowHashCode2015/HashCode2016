package hashCode2016;

import java.util.ArrayList;
import java.util.List;

public class HashCode2016 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello White Shadow");
		
		
		try {
			GlobalData gd = InputReader.readFile("testInput.in");

		    // Do your work hear
		    
			OutputWriter.writeFile("result.out", gd);
			System.out.println("Fini");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
