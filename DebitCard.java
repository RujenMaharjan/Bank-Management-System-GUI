public class DebitCard extends BankCard//creating a class that inherits attributes and method of Bank card class
{
    //declaring variables as private so that other classes cannot access variable of this class
    private int pinnumber;
    private int withdrawl_amount;
    private String date_of_withdrawl;
    private boolean haswithdrawn;
    //creating constructor of Debit Card class that accepts 6 parameters 
    public DebitCard(int balanceamount,int cardid,String bankaccount,String issuerbank,String clientname,int pinnumber)
    {
     super(balanceamount,cardid,bankaccount,issuerbank);
     super.setClientname(clientname);
     this.pinnumber=pinnumber;
     this.haswithdrawn=false;
    }
    //getter methods of Debit Card class
    public int getPinNumber()
    {
       return this.pinnumber;
    }
    public int getWithdrawl_Amount()
    {
       return this.withdrawl_amount;
    }
    public String getDate_Of_Withdrawl()
    {
       return this.date_of_withdrawl;
    }
    public boolean getHasWithdrawn()
    {
       return this.haswithdrawn;
    }
    //setter method of Debit card class
    public void setWithdrawl_Amount(int withdrawl_amount)
    {
        this.withdrawl_amount=withdrawl_amount;
    }
    //Creating withdtraw method that accepts 3 parameters
    public void Withdraw(int withdrawl_amount,String date_of_withdrawl,int pinnumber)
    {
        if(pinnumber==this.pinnumber)/*This  condition is a nested if condition where pin number is verified first if condition is verified
        ,Then inner if condition is checked where amount of money that client wants to withdraw is availabe in his account or not if yes, 
        Then client can succesfully withdraw the amount. 
        */
        {
            if(withdrawl_amount<=super.getBalanceAmount())
            {
                this.haswithdrawn=true;
                System.out.println("You have succesfully withdrawn Rs."+withdrawl_amount+" from your bank account");
                this.date_of_withdrawl=date_of_withdrawl;
                this.withdrawl_amount=withdrawl_amount;
                setBalanceAmount(getBalanceAmount()-withdrawl_amount);
                System.out.println("After withdrawl you currently have Rs"+getBalanceAmount()+" in your bank account");
            }
            else
            {
                System.out.println("You haven't got enough balance in  your account to withdraw "+withdrawl_amount);
            }
        }
        else
        {
          System.out.println("Invalid pinnumber");  
        }
    }
    @Override
    public void display()//this method overrides the disply method of Bank card class
    {
        if(haswithdrawn==true)
        {
            super.display();
            System.out.println("Your pin number is "+getPinNumber()+".");
            System.out.println("You've withdrawn Rs"+getWithdrawl_Amount()+".");
            System.out.println("You've withdrawn money in Date: "+getDate_Of_Withdrawl()+".");
        }
        else
        {
            System.out.println("You have "+getBalanceAmount()+" in your bank account.");
        }
    }
}
