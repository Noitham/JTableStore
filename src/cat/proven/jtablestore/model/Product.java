package cat.proven.jtablestore.model;

import java.util.Objects;

public class Product 
    {
        //Atributes
        private String code;
        private String name;
        private double price;
       
    //Constructors

    public Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }
    
    public Product(String code)
    {
        this.code = code;
    }

    public Product() {
    }
    
    //Accesors
    public String getCode() {
        return code;
    }
    
    public Product(Product other)
    {
        this.code = other.code;
        this.name = other.name;
        this.price = other.price;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.code);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        boolean b;
        if(obj == null) { //null object
            b = false;
        }else {
            if(obj == this){ //same object
                b = true;
        } else {
            if (obj instanceof Product) { //obj is product
                    Product other = (Product) obj;
                    b = (this.code.equals(other.code)) ? true: false;
            } else { //ob is not a product
                b = false;
            }
          }
        }
        return b;
    }

    @Override
    public String toString() {
        //return "Product{" + "code=" + code + ", name=" + name + ", price=" + price + '}';
        StringBuilder sb = new StringBuilder();
        sb.append("Product{");
        sb.append("code=");sb.append(code);
        sb.append(", name=");sb.append(name);
        sb.append(", price=");sb.append(price);
        sb.append("}");
        
        return sb.toString();
    }
        
}   
