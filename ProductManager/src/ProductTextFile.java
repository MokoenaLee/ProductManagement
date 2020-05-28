
public class ProductTextFile implements ProductDAO {

	public ProductTextFile() {
		// code to intialize fields
	}
	/**implement the ProductReader interface*/
	
	public Product getProduct(String code) {
		//code that returns a product
	}
	
	public String getProductsString() {
		//code that returns a string that lists all products
	}
	
	/**Implement the ProductWriter interface*/
	
	public boolean addProduct(Product p) {
		//code that add a Product
	}
	
	public boolean deleteProduct(Product p) {
		//code that deletes product
	}
	
	public boolean updateProduct(Product p) {
		//code that updates a Product
	}

}
