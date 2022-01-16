class Account
{
  private int AccNo;
  private String name;
  private String dob;
  private double balance;
  private String address;
  private long phoneNo;
  public int getAccNo()
  {
      return AccNo;
  }
  public String getName()
  {
      return name;

  }
  public String getDob()
  {
      return dob;

  }
  public double getBalance()
  {
      return balance;
  }
  public String getAddress()
  {
      return address;
  }
  public long getPhoneNo(){
      return phoneNo;
  }
  public void setPhoneNo(long p)
  {
      phoneNo=p;
  }
  public void setBalance(double b)
  {
      balance=b;
  }
  public void setAddress(String a){
      address=a;
  }
  public Account(String name,String dob,int accNo,String address,long phoneNo)
  {
      this.name=name;
      this.dob=dob;
      this.AccNo=accNo;
      this.address=address;
      this.phoneNo=phoneNo;
  }
  public Account(String name,String dob,int accNo,String address,int balance,long phoneNo)
  {
      this.name=name;
      this.dob=dob;
      this.AccNo=accNo;
      this.address=address;
      this.phoneNo=phoneNo;
      this.balance=balance;
  }

}


public class Account1 {
    public static void main(String args[])
    {

        Account sc=new Account("Sujeet Singh","15/01/2001",12345,"Khaira chorhata Rewa",705806849);
        System.out.println("Account number is: "+sc.getAccNo()+"\n"+"Name is: "+sc.getName());
    }
}
