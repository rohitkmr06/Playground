//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  public void setPrice(int price)
  {
    this.price=price;
  }
  public int getPrice()
  {
    return price;
  }
}
   
class Customer
{
  private String product;
  private int quantity;
  public void setProduct(String product)
  {
    this.product=product;
  }
  public String getProduct()
  {
    return product;
  }
  public void setQuantity(int quantity)
  {
    this.quantity=quantity;
  }
  public int getQuantity()
  {
    return quantity;
  }
}

class Bill 
{
  public int calcPrice(int quantity, int price)
  {
    int result=quantity*price;
    return result;
  }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    String product=s.nextLine();
    int quantity=s.nextInt();
    int price=s.nextInt();
    Item i = new Item();
    i.setPrice(price);
    Customer c = new Customer();
    c.setProduct(product);
    c.setQuantity(quantity);
    Bill obj = new Bill();
    System.out.println("Total Price is : "+obj.calcPrice(c.getQuantity(),i.getPrice()));
  }
}