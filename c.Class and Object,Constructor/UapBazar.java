
public class UapBazar 
{
	        public static void main(String[] args) 
	        {
	        Product a=new Product("Book","10","Study",1000.0f);
            System.out.println("Price:" + a.getPrice());
            a.updatePrice(1200.0f);
	        a.display();
	        double discountedPrice=a.getDiscountedPrice(20);
	        System.out.println("Discounted Price:" + discountedPrice);
	    }
	}

