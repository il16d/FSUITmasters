class Book extends Product {
    
    private String author; 

    
    public Book()
    {
        super(); 
        System.out.println("\nInside book default constructor");
        author = "John Doe";
    }

    
    public Book(String cn, String dn, double p, String au)
    {
        super(cn, dn, p);
        System.out.println("\nInside book constructor with parameters");
        
        author = au;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String au)
    {
        
        author = au;
    }

    @Override
    public void print()
    {
        super.print();
        System.out.print(", Author:" + author);
    }

}
