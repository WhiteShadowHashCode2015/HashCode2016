package POC;

/**
 * Created by alexisk on 11/02/2016.
 */
public class Product {

    public int Id;

    public int Weight;

    public Product(int id,int weight) {
        Id = id;

        Weight = weight;
    }

	@Override
	public String toString() {
		return "Product [Id=" + Id + ", Weight=" + Weight + "]";
	}
    
    
}
