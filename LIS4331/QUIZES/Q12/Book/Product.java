
class Product {
    
    private String code; 
    private String description; 
    private double price;

    
    public Product()
    {
        System.out.println("\nInside product default constructor");
        code = "abc123";
        description = "My Widget";
        price = 49.99;
    }

    
    public Product(String code, String description, double price)
    {
        System.out.println("\nInside product constructor with parameters");
        
        this.code = code;
        this.description = description; 
        this.price = price;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String cn)
    {
        
        code = cn;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String dn)
    {
        //set instance variable to parameter value
        description = dn;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double p)
    {
        //set instance variable to parameter value
        price = p;
    }

    public void print()
    {
        System.out.print("\nCode:" + code + ", Description: " + description + ", Price: $" + price);
    }

}
