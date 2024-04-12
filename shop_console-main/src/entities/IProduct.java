package entities;

public interface IProduct {
	
	void newitem (int id, String description, double price,int provideid, int quantity);
	void add(int id, int quantity);
	void remove (int id);
	void getProductById(int id);
	void getAllProduct();

}
