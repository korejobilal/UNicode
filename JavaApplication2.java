
package javaapplication2;
class bank
{
    public String name;
    protected int accountnumber;
    private int balance;
    public void setpropety (String n,int an,int bal)
    {
    name =n;
    accountnumber=an;
    balance=bal;
    }
    public void display()
    {
        System.out.println(name+"  "+accountnumber+"  "+balance);
    }
    public void deposit(int amount)
    {
        balance+=amount;
    }
    public void withdraw(int amount)
    {
        if(balance<amount)
        {
            System.out.println("insufficant balance");
        }
        else
        {
            balance=balance-amount;
        }
    }
}

public class JavaApplication2 {

    
    public static void main(String[] args) {
        bank c1=new bank();
        c1.setpropety("Bilal", 1234, 39000);
       c1.display();
     c1.deposit(400);
     c1.display();
    }
    
}
















                                3



package javaapplication3;

class Rectangle
{
    public double width,length;
    Rectangle()
    {
        this (1.0,1.0);
    }
    Rectangle(double w,double l)
    {
        width=w;
        length=l;
    }
     public double getarea()
    {
       double area=width*length;
       return area;
    }
      public double getperemeter()
    {
       double peremeter=width*length;
       return peremeter;
    }
    
}
public class JavaApplication3 {

    public static void main(String[] args) {
      
        Rectangle r1=new Rectangle();
        double a1=r1.getarea();
        System.out.println(a1);
        
    }
    
}









                        

package javaapplication3;

class Customer
{
   public String name;
   private double balance;
    public void setproperty(String n,int bal)
    {
       name=n;
       balance=bal;
    }
   public void display()
   {
       System.out.println(name+" "+balance);
   }
    public void  recordpayment( int amount)
    {
        balance-=amount;
    }
    public void recordcall( int call,int min)
    {
        if (call==1)
        {
           balance +=1*min; 
        }
        else
        {
            balance += 0.5*min;
        }
    }
}
public class JavaApplication3 {

    public static void main(String[] args) {
      
        Customer c1=new Customer();
        c1.setproperty("bilal", 5000);
        c1.display();
        c1.recordcall(1,200);
        c1.display();
        c1.recordpayment(3000);
        c1.display();
    }
    
}
