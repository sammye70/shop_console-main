package data;
import entities.Provider;
import java.util.ArrayList;

public class DbProvider implements IDbProvider {

	ArrayList<Provider> LsProvider = new ArrayList<>();
	
	
	/**
	 * <p> Items to insert
	 * @return void
	 * */
	@Override
	public void Companies() {
		
		Provider company1 = new Provider("Nature Coffee", "495-965-5875");
		Provider company2 = new Provider("Everything you need", "595-595-5555");
		Provider company3 = new Provider("New Era", "854-585-5555");
	
		// Insert Object in Array
		this.addItemsList(company1);
		this.addItemsList(company2);
		this.addItemsList(company3);
	}

	
	/**
	 * <p>Method  Insert new Object (products)
	 * @return void
	 * */
	@Override
	public void addItemsList(Provider item) {
		
		LsProvider.add(item);
	}
	
	/**
	 * <p> Method return all object inside of ArrayList (Companies)
	 * @return ArrayList of Objects (it represent of Products)
	 * */
	@Override
	public Object getItems() {
		
		System.out.println("List of Providers");
		System.out.println("-----------------------------------");
		
		for(Provider company : LsProvider) {
			
			company.getProviders();
		}
		
		return LsProvider;
	}

}
