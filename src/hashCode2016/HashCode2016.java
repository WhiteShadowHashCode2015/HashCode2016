package hashCode2016;

import java.util.ArrayList;
import java.util.List;

import POC.World;

public class HashCode2016 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello White Shadow");
		
		
		try {
			World world = InputReader.readFile("testInput.in");
			
			System.out.println(world.toString());

		    // Do your work hear
		    //comment akm
			OutputWriter.writeFile("result.out", world);
			System.out.println("Fini");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
