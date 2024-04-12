package data;
import java.util.ArrayList;
import entities.Product;

public class DbProduct implements IDbProduct {
	
	ArrayList<Product> arrProduct = new ArrayList<>();
	

	
	/**
	 * 
	 * <p>Items to insert
	 * @return void
	 * */
	@Override
	public void items()
	{
		// Create object to insert inside ArrayList Products
		Product item1 = new Product(0, "Coffee new Era 30onz", 2.36, 1);
		Product item2 = new Product(1, "Rice", 5.80, 2);
		Product item3 = new Product(2, "Six Pack Coca Cola 16onz", 6.50, 1);
		Product item4 = new Product(3, "Orange Juice 16onz", 4.00, 1);
		Product item5 = new Product(4, "Limon", 6.50, 1);
		
	
		// Insert Object in Array
		this.addItemsList(item1);
		this.addItemsList(item2);
		this.addItemsList(item3);
		this.addItemsList(item4);
		this.addItemsList(item5);

	}
	
			
	/**
	 *  <p>Insert New Object
	 *  @return void
	 * */
	@Override
	public void addItemsList(Product item) {
		
		arrProduct.add((Product) item);
	}
	
	
	
	/**
	 * <p>Get all objects inside of ArrayList (Products)
	 * @return Array of Object (Products)
	 * */
	@Override
	public Object getItems() {
		
		
		//System.out.println("Code "  + " Description     "  +   "      Price    " +  " Quantity ");
		System.out.println("Items in Stock");

		
		for(Product item : arrProduct) {
			
			item.getAllProductExProv();
		}
		
		return arrProduct;
	}


	/**
	 * <p> Method Increments item stock by id
	 * @return void
	 * */
	@Override
	public void Incrementstock(int id, int quantity) {
		
		Product p = new Product();
		
	    p = arrProduct.get(id);
	    
	    int itemid = p.getProductId();
	    int currentstock = p.getQuantity();
	    
	    if(itemid == id) {
	    	
	    	p.setQuantity(currentstock+quantity);
	    	
	    }
	}

	
}
