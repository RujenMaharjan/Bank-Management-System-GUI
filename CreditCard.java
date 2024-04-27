public class CreditCard extends BankCard//creating a class that inherits attributes and methods of Bank Card class
{
    //declaring variables as private so that other classes cannot access variable of this class
    private int cvcnumber;
    private double creditlimit;
    private double intrestrate;
    private String expirationdate;
    private int graceperiod;
    private boolean isgranted;
    //creating constructor of credit card class that accepts 8 parameters
    public CreditCard(int cardid,String clientname,String issuerbank,String bankaccount,int BalanceAmount,int cvcnumber,double intrestrate,String expirationdate)
    {
     super(BalanceAmount,cardid,bankaccount,issuerbank);
     setClientname(clientname);
     setBalanceAmount(BalanceAmount);
     this.cvcnumber=cvcnumber;
     this.intrestrate=intrestrate;
     this.expirationdate=expirationdate;
     this.isgranted=false;
    }
    //getter methods of Credit card class
    public int getCvcNumber()
    {
        return this.cvcnumber;
    }
    public double getCreditLimit()
    {
        return this.creditlimit;
    }
    public double getIntrestRate()
    {
        return this.intrestrate;
    }
    public String getExpirationDate()
    {
        return this.expirationdate;
    }
    public int getGracePeriod()
    {
        return this.graceperiod;
    }
    public boolean getIsGranted()
    {
        return this.isgranted;
    }
    //setter method of Credit Card class
    public void setCreditLimit(double creditlimit,int graceperiod)//this method checks the condition and grants the credit limit
    {
        if(creditlimit<=(2.5*getBalanceAmount()))
        {
            this.isgranted=true;
            this.graceperiod=graceperiod;
            this.creditlimit=creditlimit;
        }
        else
        {
            System.out.println("You've not got enough balance to be granted a credit.");
        }
    }
    public void cancelCreditCard()//this method cancels the credit card
    {
        this.graceperiod=0;
        this.creditlimit=0;
        this.cvcnumber=0;
        this.isgranted=false;
        System.out.println("Your credit card was succesfully cancelled");
    }
    @Override
    public void display()//this method overrides the display method of bank card class
    {
        if(this.isgranted==true)//This condition checks if credit has been granted or not
        {
            super.display();
            System.out.println("Your Cvc number is "+this.getCvcNumber()+".");
            System.out.println("Your credit limit is "+this.getCreditLimit()+".");
            System.out.println("You have to pay intrest back at the rate of "+this.getIntrestRate()+"%.");
            System.out.println("You credit will expire in "+this.getExpirationDate()+".");
            System.out.println("You have grace period of "+this.getGracePeriod()+".");
        }
        else
        {
            System.out.println("Welcome "+getClientname()+".");
            System.out.println("You have "+getBalanceAmount()+" in your bank account.");
            System.out.println("Your account number is "+getBankaccount()+".");
            System.out.println("Your Card Id is "+getCardid()+".");
            System.out.println("Your issuer bank is "+getIssuerbank()+".");
        }
    }
}