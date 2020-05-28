
public class DAOFactory
{

	public static ProductDAO getProductDAO() {
		Product pDAO = new ProductTextFile();
		return pDAO;
	}

}
