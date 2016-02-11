package POC;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexisk on 11/02/2016.
 */
public class Order {

    public int Id;

    public Position Position;

    public List<Product> Products;

    public List<Product> DeliveryProduct;


    public boolean orderFinish(){
        return Products.size() == DeliveryProduct.size();
    }

    public List<Product> GetRemainProduct (){

        if(orderFinish())
            return null;
        List<Product> deliveryProdcuct = ArrayList
        for (Product p : Products){

        }
    }

    public void DeliveryProduct(Product p){
        DeliveryProduct.add(p);
    }

    public Order(int id, POC.Position position, List<Product> products) {
        Id = id;
        Position = position;
        Products = products;
        DeliveryProduct = new ArrayList<>();
    }

	@Override
	public String toString() {
		return "\nOrder [Id=" + Id + ", Position=" + Position + ", Products="
				+ Products + "]";
	}
    
    
}
