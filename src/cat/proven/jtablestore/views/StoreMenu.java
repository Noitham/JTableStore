/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.proven.jtablestore.views;

/**
 *
 * @author dmora
 */
public class StoreMenu extends Menu {
    
    public StoreMenu(String title) {
        super(title);
        
		add( new Option("Exit") );
		add( new Option("List all products") );
		add( new Option("Search product by code") );
		add( new Option("Search product by price") );
		add( new Option("Add new product") );
		add( new Option("Modify product") );
        add( new Option("Delete product") );
        add( new Option("Clear table") );
    }
    
}

