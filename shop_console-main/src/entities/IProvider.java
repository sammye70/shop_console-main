package entities;

public interface IProvider {

	public int idproveedor = 0;
	
	void addProvider(String name, String contact);
	void removeProvider(int providerid);
	void getProviders();
	
}
