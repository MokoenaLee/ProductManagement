
public class ProductTextFile implements ProductDAO {

	public ProductTextFile() {
		String code = " ";
		double price  = 0;
		String description = " ";
		// code to initialize fields
	}
	/**implement the ProductReader interface*/
	
	public Product getProduct(String code) {
		return null;
		//code that returns a product
		
	}
	
	public String getProductsString() {
		
		//code that returns a string that lists all products
		//can use constants defined
		return " ";
	}
	
	/**Implement the ProductWriter interface*/
	
	public boolean addProduct(Product p) {
		
		//code that add a Product
		return true;
	}
	
	public boolean deleteProduct(Product p) {
		//code that deletes product
		return true;
	}
	
	public boolean updateProduct(Product p) {
		//code that updates a Product
		return true;
	}

}
