
import javax.swing.JTextField;
import java.util.ArrayList;

import ProductDAO;

public class ProductMaintFrame {
	
	//global variables for the form
	ProductDAO productDAO;
	ArrayList<Product> products;
	Product newProduct = null;
	boolean filling = false;

	/**new form for ProductMaintenanceFrame*/

	public ProductMaintFrame() {
		initComponents();//revisit
		
		/**fill the products combo box*/
		productDAO = DAOFactory.getProductDAO();//revisit
		products = productDAO.getProducts();
		this.fillComboBox(products);
		this.showProducts(this.getCurrentProduct());
		
		
	}

}
