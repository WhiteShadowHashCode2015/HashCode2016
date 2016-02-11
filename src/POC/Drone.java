package POC;



import java.util.List;

/**
 * Created by alexisk on 11/02/2016.
 */
public class Drone {


    public int Id;

    public Position Position;

    public List<Product> PayLoad;

    public int MaxWeight;


    public Drone(int id, int maxWeight, POC.Position position, List<Product> payLoad) {
        Id = id;
        MaxWeight = maxWeight;
        Position = position;
        PayLoad = payLoad;
    }


	@Override
	public String toString() {
		return "\nDrone [Id=" + Id + ", Position=" + Position + ", PayLoad="
				+ PayLoad + ", MaxWeight=" + MaxWeight + "]";
	}
    
    
}
