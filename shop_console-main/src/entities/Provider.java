package entities;

public class Provider implements IProvider{
	
	
	int providerid;
	String name;
	String contact;
	
	
	//Default Constructor
	public Provider() {}
	

	// Constructor with parameters
	public Provider(String name, String contact) {
		this.name = name;
		this.contact = contact;
	}
	

	
	@Override
	public void addProvider(String companyname, String contact) {
		
		this.setCompanyName(companyname);
		this.setContact(contact);
		
	}

	@Override
	public void removeProvider(int providerid) {
		
		
	}
	
   
	public void setCompanyName(String name) {

		this.name = name;
	}
	
	public String getCompanyName() {
		
		return this.name;
	}
	
	
	public void setContact(String contact) {
		
		this.contact = contact;
	}
	
	
	public String getContact() {
		
		return this.contact;
	}
	
	@Override
	public void getProviders() {
		
		System.out.println(this.name + " " + this.contact);
	}

}
