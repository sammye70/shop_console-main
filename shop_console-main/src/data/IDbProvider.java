package data;
import entities.Provider;

public interface IDbProvider {
	
	void Companies();
	void addItemsList(Provider item);
	Object getItems();

}
