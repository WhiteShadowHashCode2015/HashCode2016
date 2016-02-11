package POC;

import java.util.List;

/**
 * Created by alexisk on 11/02/2016.
 */
public class World {

    public List<Warehouse> WareHouses;

    public List<Drone>  Drones;

    public List<Order> Orders;

    public int CurrentRound;

    public int MaxRound;

    public World(List<Warehouse> wareHouses, int maxRound, int currentRound, List<Drone> drones) {
        WareHouses = wareHouses;
        MaxRound = maxRound;
        CurrentRound = currentRound;
        Drones = drones;
    }

    public World(List<Warehouse> wareHouses, List<Drone> drones, List<Order> orders, int currentRound, int maxRound) {
        WareHouses = wareHouses;
        Drones = drones;
        Orders = orders;
        CurrentRound = currentRound;
        MaxRound = maxRound;
    }

	@Override
	public String toString() {
		return "World [WareHouses=" + WareHouses + ", Drones=" + Drones
				+ ", Orders=" + Orders + ", CurrentRound=" + CurrentRound
				+ ", MaxRound=" + MaxRound + "]";
	}
    
    
}
