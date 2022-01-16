class products
{
    private String itemno;
    private String name;
    private int price;
    private int quantity;

  public String getItemno(){
        return itemno;
    }
    public String getName()
    {
        return name;
    }
    public int getPrice()
    {
        return price;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void setPrice(int p)
    {
        price=p;
    }
    public products(String itemno1)
    {
        itemno=itemno1;
        name="Jeans";
        price=500;
        quantity=3;
    }
    public products(int q)
    {
        quantity=q;
    }
}
public class product {
    public static void main(String args[])
    {
            products pr=new products("234AF");
        System.out.println(pr.getItemno());

    }
}
