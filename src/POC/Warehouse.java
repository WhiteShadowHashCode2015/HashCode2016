package POC;

import java.util.List;

/**
 * Created by alexisk on 11/02/2016.
 */
public class Warehouse {

    public Position Position;

    public List<Pair<Integer,Product>> Products;





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
    }

	@Override
	public String toString() {
		return "\nWarehouse [Position=" + Position + ", Products=" + Products
				+ "]";
	}
    
    
}
