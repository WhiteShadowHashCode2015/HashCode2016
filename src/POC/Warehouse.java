package POC;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexisk on 11/02/2016.
 */
public class Warehouse {

    public Position Position;

    public List<Pair<Integer,Product>> Products;

    public int Id;
    public List<Order> Orders;

    public List<Drone> Drones;


    public int GetProductCount(int id ){

        for(int i=0; i< Products.size(); i++){
            if(Products.get(i).getRight().Id
                    == id) {
                return Products.get(i).getLeft();
            }
        }
        return -1;
    }



    public Warehouse(POC.Position position, List<Pair<Integer, Product>> products) {
        Position = position;
        Products = products;

        Orders =  new ArrayList<>();
        Drones =  new ArrayList<>();
    }

	@Override
	public String toString() {
		return "\nWarehouse [Position=" + Position + ", Products=" + Products
				+ "]";
	}


    public boolean canResponseOrder(Order order){
       boolean retour = true;
        for (Product p : order.Products){

        }

        return retour;
    }

    public void associateOrderToDrone(){

        if(Drones.size() == 0)
            return;
        int numDrone = 0;
        for(Order o : Orders){

            for (Product p : o.Products){
               if(GetProductCount(p.Id) > 0){
                   if( (Drones.get(numDrone).GetWeight()+p.Weight) <= Drones.get(numDrone).MaxWeight) {
                       Drones.get(numDrone).Commands.add(Command.GenerateLoadCommand(Id, 1, p.Id));
                   }else{
                       numDrone++;
                       Drones.get(numDrone).Commands.add(Command.GenerateDeliverCommand(o.Id, 1, p.Id));
                   }
               }
            }
        }
    }
    
    
}
