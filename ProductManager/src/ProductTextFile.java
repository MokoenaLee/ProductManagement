import java.util.ArrayList;

public class ProductTextFile implements ProductDAO {

	private ArrayList<Product> products = new ArrayList<Product>();

	/**use an Arraylist to act as storage for products, next to use a DB*/
	public ProductTextFile() {
		
			Product item = new Product();
			item.setDescription("South West Exploration");
			item.setCode("SWE");
			item.setPrice(49.50);
			
			products.add(item);
			
			Product product = new Product();
			product.setDescription("All The Stars");
			product.setCode("ATS");
			product.setPrice(13.00);
			
			products.add(product);
			
			Product book = new Product();
			book.setDescription("Who Moved My Cheese?");
			book.setCode("WMC");
			book.setPrice(10.00);
			
			products.add(product);
			
	
	}
	/**implement the ProductReader interface*/
	
	public Product getProduct(String productCode) {
		
        Product p = null;
		
		if(productCode.equalsIgnoreCase("RTLove") || productCode.equalsIgnoreCase("FoWork") || productCode.equalsIgnoreCase("WinFs") ) {
		// create Product object 
		
		Book b = new Book();
		
		if(productCode.equalsIgnoreCase("RTLove"))
		{
			p.setDescription("Return to Love");
			p.setCode(productCode);
			p.setPrice(49.50);
		} 
		else if (productCode.equalsIgnoreCase("FoWork"))
		{
			p.setDescription("Focused Work");
			p.setCode(productCode);
			p.setPrice(30.50);
			
		}
		
		else if (productCode.equalsIgnoreCase("WinFs"))
		{
			p.setDescription("Win over Friends");
			p.setCode(productCode);
			p.setPrice(25.50);
		}
		else 
		{
			p = b;
		}
		
		
	}
		return p;
		
	}
	
	public ArrayList<String> getProductsString() {
		ArrayList<String> productList = new ArrayList<String>(); 
		//reach each product object and use toString method to retrieve and return in String format
		for(Product eachBook: products) {
			productList.add(eachBook.toString());	
		}
		
		return productList;
		//can use constants defined
	}
	
	/**Implement the ProductWriter interface*/
	
	public boolean addProduct(Product p) {
		
		return products.add(p);
	}
	
	public boolean deleteProduct(Product p) {
		
		return products.remove(p);
	}
	
	public boolean updateProduct(Product p) {
		
		return true;
	}

}
