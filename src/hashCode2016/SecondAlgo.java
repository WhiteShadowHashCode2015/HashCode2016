package hashCode2016;

import java.util.ArrayList;
import java.util.List;

import POC.*;

/**
 * Created by Iler / Gaetan on 11/02/2016.
 */
public class SecondAlgo {


    public static World Execute(World w ){

        List<Warehouse> wareHouses = w.WareHouses;
        List<Order> orders = w.Orders;
        List<Drone> drones = w.Drones;

        for (int i=0; i<orders.size(); i++) {

            List<ArrayList<Warehouse>> possibleCombinWareHouses = findWarehouseWithEnoughProduct(orders.get(i), wareHouses);
            List<Drone> possibleDrones = findPossibleDrones(orders.get(i), drones);

            // Find best path
            Pair<Drone, List<Warehouse>> bestPath = findBestPath(possibleDrones, possibleCombinWareHouses, orders.get(i));
            
            executeOrder(bestPath.getLeft(), bestPath.getRight(), orders.get(i));

        }

    	return null;
    }

    public static List<ArrayList<Warehouse>> findWarehouseWithEnoughProduct(Order order, List<Warehouse> wareHouses){
        List<ArrayList<Warehouse>> wHouseCombinaison = new ArrayList<ArrayList<Warehouse>>();
        List<Product> products = order.Products;
        for (int i=0;i<wareHouses.size(); i++) {
            Warehouse currentWarehouse = wareHouses.get(i);
        }

        return wHouseCombinaison;
    }

    public static List<Drone> findPossibleDrones(Order order, List<Drone> drones){
        List<Drone> rightDrone = new ArrayList<Drone>();

        return rightDrone;
    }


    public static Pair<Drone, List<Warehouse>> findBestPath(List<Drone> drones, List<Warehouse> wareHouses, Order order){
        Pair<Drone, List<Warehouse>> pair = null;

        return pair;
    }


    public static void executeOrder(Drone drone, Warehouse wareHouse, Order order){

    }
}
