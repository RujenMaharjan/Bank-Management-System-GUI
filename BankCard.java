public class BankCard //creating a class
{
    //declaring variables as private so that other classes cannot access variable of this class
    private int cardid;
    private String clientname;
    private String issuerbank;
    private String bankaccount;
    private int BalanceAmount;
    //creating constructor that accepts 4 parameter and sets clientname as empty string
    public BankCard(int BalanceAmount,int cardid,String bankaccount,String issuerbank)
    {
        this.clientname="";
        this.BalanceAmount=BalanceAmount;
        this.cardid=cardid;
        this.bankaccount=bankaccount;
        this.issuerbank=issuerbank;
    }
    //creating getter method for encapsulation
    public int getCardid()
    {
        return this.cardid;
    }
    public int getBalanceAmount()
    {
        return this.BalanceAmount;
    }
    public String getBankaccount()
    {
        return this.bankaccount;
    }
    public String getIssuerbank()
    {
        return this.issuerbank;
    }
    public String getClientname()
    {
        return this.clientname;
    }
    //creating setter method for setting value of variable and if it already exists then updating it
    public void setClientname(String clientname)
    {
        this.clientname=clientname;
    }
    public void setBalanceAmount(int BalanceAmount)
    {
        this.BalanceAmount=BalanceAmount;
    }
    //display method for displaying data with proper annotation
    public void display()
    {
        if(this.clientname.equals(""))
        {
            System.out.println("Sorry You have not registerd your name in our bank.");
            System.out.println("If you have any issues regarding your account please contact our helpline");
        }
        else
        {
            System.out.println("Your Name is "+getClientname()+".");
            System.out.println("You have "+getBalanceAmount()+" in your bank account.");
            System.out.println("Your account number is "+getBankaccount()+".");
            System.out.println("Your Card Id is "+getCardid()+".");
            System.out.println("Your issuer bank is "+getIssuerbank()+".");
        }
    }
}