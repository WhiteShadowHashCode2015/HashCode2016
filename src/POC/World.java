package POC;

import java.util.List;

/**
 * Created by alexisk on 11/02/2016.
 */
public class World {

    public List<Warehouse> WareHouses;

    public List<Drone>  Drones;

    public int CurrentRound;

    public int MaxRound;

    public World(List<Warehouse> wareHouses, int maxRound, int currentRound, List<Drone> drones) {
        WareHouses = wareHouses;
        MaxRound = maxRound;
        CurrentRound = currentRound;
        Drones = drones;
    }
}
