package entities;
import java.util.ArrayList;


public class Cart extends Customer implements ICart {
	
	String customer;
	ArrayList<Product> items = new ArrayList<>();
	double price;
	double total;
	
	
	//Current Constructor extends customer constructor and its parameters
	public Cart() {
		this.customer = super.name;
	}
	

	// Add item to cart
	@Override
	public void addItem(Product item) {
		double subtotal =item.getQuantity() * item.getPrice();
		price = item.getPrice();
		items.add(item);
		//=item.getPrice();
		this.getamount(subtotal);
	}

	
	// Remove item from the cart by id
	@Override
	public void removeItem(int itemid) {
		
		items.remove(itemid);
		
	}

	/**
	 * <p>Get amount after added last item inside the cart
	 * @return void
	 * */
	@Override
	public void getamount(double subtotal) {
		
		this.total += subtotal;
	}
	
	
	@Override
	public void getallitems() {
	
		System.out.println("Sky Stores");
		System.out.println("----- Invoice ------");
		System.out.println("Date: " + java.time.LocalDate.now());
		System.out.println("Time: " + java.time.LocalTime.now());
		System.out.println("Customer: " + this.customer);

		for(Product ls : items) {
			System.out.println("Item name " 	+ " Quantity "		+ 	" Price	 ");
			System.out.println(ls.getDescription() + "      " + ls.getQuantity() + "          " + ls.getPrice());
		}
		
		System.out.println("Total: " + total );
		
	}
}
