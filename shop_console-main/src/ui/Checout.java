package ui;
import entities.*;

import java.util.InputMismatchException;
import java.util.Scanner;

import data.DbProduct;
import data.DbProvider;

public class Checout {
	
    @SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		
		// Product p = new Product();
		
		// p.newitem(5454, "Dental Scream", 5.57, 5, 45);
		// p.getAllProduct();

    	try {
		
		  while(true) {
			
			System.out.println("Welcome to Sky Stores");
			System.out.println();
			System.out.println(" Main Menu ");
			System.out.println();
			System.out.println("Select one number of the list below");
			System.out.println("1)List of Products");
			System.out.println("2)List of Providers");
			System.out.println("3)Checkout");
			System.out.println("4)Quit");
		
			
			
			Scanner sc = new Scanner(System.in);
			
			int op = sc.nextInt();
			
			
			switch(op) {
			
			case 1 :
				//load all items in db
				DbProduct db = new DbProduct();
				db.items();
				db.getItems();
			break;
			
			case 2 :
				//load all provider in db
				DbProvider db1 = new DbProvider();
				db1.Companies();
				db1.getItems();

			break;
			
			case 3 :
				
				System.out.println("Begin your shopping time");

				try {
						Cart c = new Cart();
						
						Product item = new Product();
		
						System.out.println("Indicate code:");
						int code = sc.nextInt();
						
						
						item.setProductId(code);
						System.out.println();
						System.out.println("Indicate Description:");
						String desc = sc.next();
						item.setDescription(desc);
						System.out.println();
						System.out.println("Indicate some Quantity:");
						int q = sc.nextInt();
						item.setQuantity(q);
						System.out.println();
						System.out.println("Indicate price:");
						double price = sc.nextDouble();
						item.setPrice(price);

						//Insert Elements at cart
						c.addItem(item);
												
						//Print invoice
						c.getallitems();
					 } catch(Exception ex) {
						
					       throw new Exception("Uppp something went wrong!!");
					
				       }			
			break;
			
			case 4 :
				 System.out.println("Good Bye!!");
			     System.exit(0);
			break;
			
			
			default:
				System.out.println("Incorrect option. Please select one in the list");
				sc.close();
			}
			
		  }

        }
    	catch(InputMismatchException ex) {
    		
    		System.out.println("Incorrect option. Please select one in the list");
    	}
	}

}
