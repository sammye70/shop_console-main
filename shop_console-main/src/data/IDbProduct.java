package data;

import entities.Product;

public interface IDbProduct {
	
	void items();
	void addItemsList(Product item);
	Object getItems();
	void Incrementstock(int id, int quantity);

}
