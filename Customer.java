
public class Customer
{
    String Name;
    String Phone;
        
    public Customer(String N,String P)
    {
        super();
        Name = N;
        Phone = P;
    }
    
    public String display()
    {
        return ("Here is the customer's information: \nName: " + Name + "\nPhone Number: " 
            +Phone);
    }
}