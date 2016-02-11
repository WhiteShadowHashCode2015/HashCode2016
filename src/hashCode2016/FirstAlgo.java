package hashCode2016;

import POC.Order;
import POC.Position;
import POC.Warehouse;
import POC.World;

/**
 * Created by alexisk on 11/02/2016.
 */
public class FirstAlgo {


    public static World Execute(World w ){

    	//Associer order par wareHouse
        for (Order o : w.Orders){
            double dist = Double.MAX_VALUE ;
            Warehouse associateWareHouse= w.WareHouses.get(0);
            for (Warehouse ware : w.WareHouses){
                double tempDist = Position.distance(o.Position, ware.Position);
                if(tempDist<dist){
                    dist=tempDist;
                    associateWareHouse= ware;
                }
            }
            associateWareHouse.Orders.add(o);
        }


        int droneAffecte = 0;
        int totalDrone = w.Drones.size();
        int ii=0;
        //Associe Drone sur DataWareHouse
        for (Warehouse ware : w.WareHouses){

            double pour= ware.Orders.size()/ w.Orders.size();


            int numberDrone = (int) Math.round(pour*totalDrone);

            for (int i = droneAffecte; i <droneAffecte+numberDrone ; i++) {

                ware.Id = ii;
                ware.Drones.add(w.Drones.get(i));


            }

            ii++;

        }





        return w;
    }
}
