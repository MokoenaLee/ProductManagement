/**Provides the data processing for this program. It's meant to return
 * a Product object based on the code passed to it. Creates the database layer that creates a Product Object*/
public class ProductDB {

	public static Product getProduct(String productCode) 
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
			p.setPrice(25.50);
			
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
