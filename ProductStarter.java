class ProductStarter{
public static void main(String [] chocolates)
{
  Product product=new Product();
  product.displayDetails();
  product.name="Mpbile";
  product.price=15.0;
  product.quality=true;
  product.quantity=5;
  product.isMark=true;
  product.displayDetails();
  }
  
      System.out.println("invoked displayDetails");
	  System.out.println("this.name");
	  System.out.println("this.quantity");
	  System.out.println("this.price");
	  System.out.println("this.quality");
	  System.out.println("this.isMark");
	 }
	 
	 void displayTotalPrice()
	 {
	   System.out.println("invoked displayTotalPrice");
	   double totalPrice=this.quantity*this.price;
	   System.out.println(totalPrice);
	   }
	  }
	  