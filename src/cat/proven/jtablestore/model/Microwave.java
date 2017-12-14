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
public class Microwave extends Product {
    
    private int power;
    
    public Microwave(String code, String name, double price, int power){
        super(code, name, price);
        this.power = power;
    }

    public Microwave(String code, String name, double price) {
        super(code, name, price);
    }
    
    public Microwave(String code){
        super(code);
    }
    
    public Microwave(){
        super();
    }
    
    public Microwave(Product product, int power){
        super(product);
        this.power = power;
    }
    
    public int getPower(){
        return power;
    }
    
    public void setPower(int power){
        this.power = power;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Microwave(");
        sb.append(super.toString());
        sb.append(", power= ");sb.append(power);
        sb.append("}");
        return sb.toString();
        
    }
    
    
    
}
