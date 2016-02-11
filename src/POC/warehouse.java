package POC;

import java.util.List;

/**
 * Created by alexisk on 11/02/2016.
 */
public class Warehouse {

    public Position Position;

    public List<Product> Products;



    public Product GetProduct(int id ){

        for(int i=0; i< Products.size(); i++){
            if(Products.get(i).Id == id) {
                return Products.get(i);
            }
        }
    }


}
