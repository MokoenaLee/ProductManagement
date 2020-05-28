
public class Book extends Product implements Printable {
	
	private String author;

	public Book() {
		super();
		//this.author = author;
		//count++;
	}
	
	
	
	public void setCode(String code)
	{
		super.setCode(code);
		//this.code = code;
		
	}
	
	
	public void setDescription(String description)
	{
		super.setDescription(description);
		//this.description = description;
		
	}
	
	public void setPrice(double price)
	{
		super.setPrice(price);
		
		//this.price = price;
		
	}
	
	
	
	public void setAuthor(String author) 
	{
		this.author = author;
		
	}
	
	public String getAuthor() 
	{
		return author;
		
	}
	
	public void print()
	{
		System.out.println("Code:\t" + super.getCode());
		System.out.println("Title:\t" + super.getDescription());
		System.out.println("Author:\t" + this.author);
		System.out.println("Price:\t" + super.getFormattedPrice());
		
		
	}
	

}
