package hashCode2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import POC.*;

public class InputReader {

	public static World readFile(String filePath) throws FileNotFoundException{
		 
		Scanner scanner= new Scanner(new File(filePath));
		 
		GlobalData gd = new GlobalData();
		World world;
		
		//Read global informations
	    //gd.truc = scanner.nextInt();
		int nbRow =  scanner.nextInt();   
		int nbCol =  scanner.nextInt();   
		int nbDrone =  scanner.nextInt();   
		int nbTurn =  scanner.nextInt();   
		int maxPlayload =  scanner.nextInt();   
		int nbTypeProd =  scanner.nextInt(); 
		List<Product> products = new ArrayList<Product>();  
		List<Order> orders = new ArrayList<Order>();
		List<Drone> drones = new ArrayList<Drone>();
		List<Warehouse> warehouses = new ArrayList<Warehouse>();


		//Product Weight
		for (int i=0; i<nbTypeProd; i++) {
			Product product =  new Product(i, scanner.nextInt()); 
			products.add(product);  
		}

		int nbWarehouse = scanner.nextInt();   

		
		for (int i=0; i<nbWarehouse; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			Position pos = new Position(x, y);
			List<Pair<Integer, Product>> prods = new ArrayList();
			for (int j=0; j<nbTypeProd; j++) {
				int nbProd = scanner.nextInt();
				if(nbProd!=0){
					prods.add(new Pair<Integer, Product>(nbProd, products.get(j)));
				}
				
			}
			Warehouse warehouse =  new Warehouse(pos, prods);   
			warehouses.add(warehouse);
		}

		int nbOrder =  scanner.nextInt(); 
		for (int i=0; i<nbOrder; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			Position pos = new Position(x, y);
			int nbItem = scanner.nextInt();
			List<Product> prods = new ArrayList<Product>();

			for (int j=0; j<nbItem; j++) {
				int idItem = scanner.nextInt();
				prods.add(products.get(idItem));
			}
			Order order = new Order(i, pos, prods);
			orders.add(order);
		}

		for (int i=0; i<nbDrone; i++) {
			Position position = warehouses.get(0).Position;
			Drone drone = new Drone(i, maxPlayload, position, new ArrayList<Product>());
			drones.add(drone);
		}

		world = new	World(warehouses, drones, orders, 0, nbTurn, nbTypeProd);
		    
		scanner.close();
		return world;
	}
	
}
