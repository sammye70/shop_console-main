package entities;
import data.DbProduct;

public class Product extends Provider implements IProduct {
	
	private int id;
	private String description;
	private double price;
	private int stock;
	
	
	
	public Product() {}
	

	//Constructor with parameters
		public Product(int id, String description, double price, int stock) {
		
			this.id = id;
			this.description = description;
			this.price = price;
			this.stock = stock;
		}


	// Create new product to stock
	@Override
	public void newitem(int id, String description, double price, int provideid, int quantity) {
			
		this.setProductId(id);
		this.setDescription(description);
		this.setPrice(price);
		super.providerid = provideid;
		this.setQuantity(quantity);		
	}
	
	// set new stock some item id
	@Override
	public void add(int id, int quantity) {
	
		DbProduct db = new DbProduct();
		
		db.Incrementstock(id, quantity);
		
	}
	
	
	// Remove some product by id
	@Override
	public void remove(int id) {
		this.id = id;
		
	}


	// 
	@Override
	public void getAllProduct() {
		
		//System.out.println(" Code "  + " Description "  +	" Provider "  + " Quality ");
		System.out.println("------------------------------");
		System.out.println("Code: " + id);
		System.out.println(" Description: " + description);
		System.out.println(" Price: " + price);
		System.out.println(" Provider: " + super.providerid);
		System.out.println(" Quantity:" + stock);
	}
	

	public void getAllProductExProv() {
	
		System.out.println("------------------------------");
		System.out.println(" Code: " + id);
		System.out.println(" Description: " + description);
		System.out.println(" Price: " + price);
		System.out.println(" Quantity:" + stock);

	}

	
	public void setProductId(int productid) {
		this.id = productid;
	}
	
	public int getProductId() {
		return this.id;
	}
	
	public void setDescription(String description) {
		
		this.description = description;	
	}
	
	
	public String getDescription() {
		return this.description;
	}
	
	
	
	public void setPrice(double price){
		this.price = price;
	}
	
	
	public double getPrice(){
		return this.price;
	}
	
	
	public void setProviderId(int providerid) {
		
		super.providerid = providerid;
	
	}
	
	
	public int getProviderId() {
		return super.providerid;
	}
	
	
	// Set current Product Quantity
	public void setQuantity(int quantity ) {
		
		this.stock = quantity;
	}
	
	public int getQuantity() {
		return this.stock;
	}


	
	@Override
	public void getProductById(int id) {
		
		
	}

	


	
	


}
