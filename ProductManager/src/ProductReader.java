import java.util.ArrayList;

public interface ProductReader {
	
	Product getProduct(String code);
	ArrayList<String> getProductsString();

}
