/**Provides the data processing for this program. It's meant to return
 * a Product object based on the code passed to it. Creates the database layer that creates a Product Object*/

import java.util.ArrayList;
public class ProductDB  implements ProductDAO {
	
	
	@Override
	public Product getProduct(String productCode) {
		
		throw new UnsupportedOperationException("Not supported yet");
	}
	
	@Override
	public ArrayList<String> getProductsString() {
		
		throw new UnsupportedOperationException("Not supported yet");
	}
	
	@Override
	public boolean addProduct(Product p) {
		throw new UnsupportedOperationException("Not supported yet");
	}
	
	@Override
	public boolean updateProduct(Product p) {
		throw new UnsupportedOperationException("Not supported yet");
	}
	
	@Override
	public boolean deleteProduct(Product p) {
		throw new UnsupportedOperationException("Not supported yet");
	}

	
	

}
