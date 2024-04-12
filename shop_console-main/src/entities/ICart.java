package entities;

public interface ICart {
	
	void removeItem(int itemid);
	void getamount(double price);
	void addItem(Product item);
	void getallitems();
		

}
