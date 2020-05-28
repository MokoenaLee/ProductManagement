/**Provides the data processing for this program. It's meant to return
 * a Product object based on the code passed to it. Creates the database layer that creates a Product Object*/
public class ProductDB {

	public static Product getProduct(String productCode) 
	{
		// create Product object 
		Product p = new Product();
		
		//fill Product object with data
		p.setCode(productCode);
		
		if(productCode.equalsIgnoreCase("OOP"))
		{
			p.setDescription("Object Oriented Programming");
			p.setPrice(49.50);
		} 
		else if (productCode.equalsIgnoreCase("Pizza"))
		{
			p.setDescription("Pappa John's");
			p.setPrice(25.50);
			
		}
		
		else if (productCode.equalsIgnoreCase("Teas"))
		{
			p.setDescription("Rooibos");
			p.setPrice(25.50);
		}
		else 
		{
			p.setDescription("Unknown");
		}
		return p;
		
	}

	
	

}
