/**Provides the data processing for this program. It's meant to return
 * a Product object based on the code passed to it. Creates the database layer that creates a Product Object*/
import java.util.ArrayList;

public class ProductDB  implements ProductDAO {
	
	private ArrayList<Product> products = new ArrayList<Product>();
	
	public ProductDB() {
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
		
	}
	
	
	
	@Override
	public Product getProduct(String code) {
		throw new UnsupportedOperationException("Not supported yet");
	}
	
	@Override
	public String getProductsString() {
		String productList = " "; 
		//reach each product object and use toString method to retrieve and return in String format
		for(Product eachBook: products) {
			productList += eachBook.toString() + "\n";	
		}
		
		return productList;
		//throw new UnsupportedOperationException("Not supported yet");
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

/**this method was initially getProduct(String productCode)*/
	public static Product getProduct1(String productCode) 
	{
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

	
	

}
