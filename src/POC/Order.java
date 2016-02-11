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


    public void DeliveryProduct(Product p){
        DeliveryProduct.add(p);
    }

    public Order(int id, POC.Position position, List<Product> products) {
        Id = id;
        Position = position;
        Products = products;
        DeliveryProduct = new ArrayList<>();
    }
}
