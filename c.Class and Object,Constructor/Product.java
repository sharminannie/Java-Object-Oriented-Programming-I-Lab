
public class Product
{
	    String name;
	    String id;
	    String category;
	    double price;
	    public Product(String name,String id,String category,double price) 
	    {
	        this.name=name;
	        this.id=id;
	        this.category=category;
	        this.price=price;
	    }

	    public void updatePrice(double newPrice) 
	    {
	        this.price=newPrice;
	    }
        public double getPrice() 
        {
	        return this.price;
	    }
	    public double getDiscountedPrice(double discountPercentage) 
	    {
	        double discount=(discountPercentage / 100) * this.price;
	        return this.price - discount;
	    }
	    public void display() 
	    {
	    	System.out.printf("Name:%s\nId:%s\nCategory:%s\nPrice:%.2f\n",name,id,category,price);
	        
	    }
	}


