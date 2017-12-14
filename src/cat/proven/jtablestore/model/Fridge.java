/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.proven.jtablestore.model;

/**
 *
 * @author dmora
 */
public class Fridge extends Product {
    
    private int capacity;
    
    public Fridge(String code, String name, double price, int capacity){
        super(code, name, price);
        this.capacity = capacity;
    }

    public Fridge(String code, String name, double price) {
        super(code, name, price);
    }
    
    public Fridge(String code){
        super(code);
    }
    
    public Fridge(){
        super();
    }
    
    public Fridge(Product product, int capacity){
        super(product);
        this.capacity = capacity;
    }
    
    public int getCapacity(){
        return capacity;
    }
    
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Fridge(");
        sb.append(super.toString());
        sb.append(", capacity= ");sb.append(capacity);
        sb.append("}");
        return sb.toString();
        
    }
    
    
    
}
