import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
public class BankGUI implements ActionListener
{
    private int dcardid,dpinnumber,dbalanceamt,ccardid,ccvcnum,cbalanceamt,witcardid,witpinnumber,witwithdrawlamt,setcrcardid,setcrgrace;
    private String dclientname,dissuerbank,dbankacc,cclientname,cissuerbank,cbankacc,cexpdate,witdateofwith;
    private double cinterestrate,setcrcredlimit;
    ArrayList<BankCard> al= new ArrayList<BankCard>();
    private JFrame jf1,jf2,jf3,jf4,jf5,jf6;
    private JLabel bancardid,banclientname,banissuerbank,banbankacc,banbalanceamt,crecvc,creinterestrate,creexpdate,debpinnumber,wdwithdrawlamt,wddateofwith,setcreditlimit,setgraceperiod,crecardid,creclientname,creissuerbank,crebankacc,crebalanceamt,debcardid,debclientname,debissuerbank,debbankacc,debbalanceamt,wdcardid,wdpinnumber,setcardid,cancclientid;
    private JTextField bantfcardid,bantfclientname,bantfissuerbank,bantfbankacc,bantfbalanceamt,cretfcvc,cretfinterestrate,debtfpinnumber,wdtfpinnumber,settfcreditlimit,settfgrace,wdtfwithdrawlamt,cretfcardid,cretfclientname,cretfissuerbank,cretfbankacc,cretfbalanceamt,debtfcardid,debtfclientname,debtfissuerbank,debtfbankacc,debtfbalanceamt,wdtfcardid,settfcardid,canctfclientname;
    private JButton banbtcredit,banbtdeb,jcclientname,crebtncancel,crebtnsetcred,debbtnwithdraw,banbtclear,crebtnclear,debbtnclear,wdbtnclear,setbtnclear,crebtndisplay,debbtndisplay,wdbtndisplay,setbtndisplay,crebtnaddcred,debbtnadddebit,wdbtnwith,setbtcrlm,cancbtcancred;
    private JComboBox crecbexpdate,wdcbdateofwith;
    public BankGUI()
    {
       jf1=new JFrame("Bank Card"); 
       
       bancardid=new JLabel("Card ID :");
       banclientname=new JLabel("Client Name :");
       banissuerbank=new JLabel("Issuer Bank :");
       banbankacc=new JLabel("Bank Account :");
       banbalanceamt=new JLabel("Balance Amount :");
       
       bantfcardid=new JTextField();
       bantfclientname=new JTextField();
       bantfissuerbank=new JTextField();
       bantfbankacc=new JTextField();
       bantfbalanceamt=new JTextField();
       
       banbtcredit=new JButton("Credit Card");
       banbtdeb=new JButton("Debit Card");
       banbtclear=new JButton("Clear");
       jcclientname=new JButton();
       
       bancardid.setFont(new Font("Regular", Font.PLAIN, 22));
       banclientname.setFont(new Font("Regular", Font.PLAIN, 22));
       banissuerbank.setFont(new Font("Regular", Font.PLAIN, 22));
       banbankacc.setFont(new Font("Regular", Font.PLAIN, 22));
       banbalanceamt.setFont(new Font("Regular", Font.PLAIN, 22));
       
       bancardid.setBounds(201,100,100,40);
       banclientname.setBounds(201,178,148,40);
       banissuerbank.setBounds(201,256,143,40);
       banbankacc.setBounds(201,329,163,40);
       banbalanceamt.setBounds(201,402,189,40);
       bantfcardid.setBounds(398,108,363,32);
       bantfclientname.setBounds(398,192,363,32);
       bantfissuerbank.setBounds(398,264,363,32);
       bantfbankacc.setBounds(398,336,363,32);
       bantfbalanceamt.setBounds(398,404,363,32);
       banbtcredit.setBounds(31,536,197,48);
       banbtdeb.setBounds(713,536,197,48);
       banbtclear.setBounds(372,536,197,48);
       
       banbtcredit.addActionListener(this);
       banbtdeb.addActionListener(this);
       banbtclear.addActionListener(this);
       
       jf1.add(bancardid);
       jf1.add(banclientname);
       jf1.add(banissuerbank);
       jf1.add(banbankacc);
       jf1.add(banbalanceamt);
       jf1.add(bantfcardid);
       jf1.add(bantfclientname);
       jf1.add(bantfissuerbank);
       jf1.add(bantfbankacc);
       jf1.add(bantfbalanceamt);
       jf1.add(banbtcredit);
       jf1.add(banbtdeb);
       jf1.add(banbtclear);
       jf1.add(jcclientname);
       
       Color c= new Color(126, 189, 240);
       jf1.getContentPane().setBackground(c);
       jf1.setVisible(true);
       jf1.setLayout(null);
       jf1.setBounds(300,30,940,655);
       jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jf1.setResizable(false);
    }
    @Override
    public void  actionPerformed(ActionEvent e)
    {
       if(e.getSource()==banbtcredit)
       {
           jf2= new JFrame("Credit Card");
           
           crecardid=new JLabel("Card Id :");
           creclientname=new JLabel("Client Name :");
           creissuerbank=new JLabel("Issuer Bank :");
           crebankacc=new JLabel("Bank Account :");
           crebalanceamt=new JLabel("Balance Amount :");
           crecvc= new JLabel("CVC Number :");
           creinterestrate= new JLabel("Interest rate :");
           creexpdate= new JLabel("Expiration Date :");
           
           cretfcardid= new JTextField(bantfcardid.getText());
           cretfclientname= new JTextField(bantfclientname.getText());
           cretfissuerbank= new JTextField(bantfissuerbank.getText());
           cretfbankacc= new JTextField(bantfbankacc.getText());
           cretfbalanceamt= new JTextField(bantfbalanceamt.getText());
           cretfcvc= new JTextField();
           cretfinterestrate= new JTextField();
           
           String exp[]={"2013-02-02","2018-09-09","2020-09-07","2022-09-08"};
           crecbexpdate= new JComboBox(exp);
           

           
           crebtncancel= new JButton("Cancel Credit Card");
           crebtnsetcred= new JButton("Set Credit Limit");
           crebtndisplay= new JButton("Display");
           crebtnclear= new JButton("Clear");
           crebtnaddcred= new JButton("Add Credit Card");
           jcclientname=new JButton();
           
           crebtnsetcred.addActionListener(this);
           crebtncancel.addActionListener(this);
           crebtndisplay.addActionListener(this);
           crebtnclear.addActionListener(this);
           crebtnaddcred.addActionListener(this);
           
           crecardid.setFont(new Font("Regular", Font.PLAIN, 22));
           creclientname.setFont(new Font("Regular", Font.PLAIN, 22));
           creissuerbank.setFont(new Font("Regular", Font.PLAIN, 22));
           crebankacc.setFont(new Font("Regular", Font.PLAIN, 22));
           crebalanceamt.setFont(new Font("Regular", Font.PLAIN, 22));
           crecvc.setFont(new Font("Regular", Font.PLAIN, 22));
           creinterestrate.setFont(new Font("Regular", Font.PLAIN, 22));
           creexpdate.setFont(new Font("Regular", Font.PLAIN, 22));
           
           crecardid.setBounds(201,50,100,40);
           creclientname.setBounds(201,119,148,40);
           creissuerbank.setBounds(201,196,143,40);
           crebankacc.setBounds(201,256,163,40);
           crebalanceamt.setBounds(201,334,189,40);
           crecvc.setBounds(201,403,163,40);
           creinterestrate.setBounds(201,472,155,40);
           creexpdate.setBounds(201,541,182,40);
           cretfcardid.setBounds(398,58,363,32);
           cretfclientname.setBounds(398,127,363,32);
           cretfissuerbank.setBounds(398,196,363,32);
           cretfbankacc.setBounds(398,265,363,32);
           cretfbalanceamt.setBounds(398,334,363,32);
           cretfcvc.setBounds(398,403,363,32);
           cretfinterestrate.setBounds(398,472,363,32);
           crecbexpdate.setBounds(398,549,363,32);
           crebtndisplay.setBounds(257,694,197,48);
           crebtnaddcred.setBounds(371,608,197,48);
           crebtncancel.setBounds(27,694,197,48);
           crebtnsetcred.setBounds(720,694,197,48);
           crebtnclear.setBounds(505,694,197,48);
           
           jf2.add(crecardid);
           jf2.add(creclientname);
           jf2.add(creissuerbank);
           jf2.add(crebankacc);
           jf2.add(crebalanceamt);
           jf2.add(crecvc);
           jf2.add(creinterestrate);
           jf2.add(creexpdate);
           jf2.add(cretfcardid);
           jf2.add(cretfclientname);
           jf2.add(cretfissuerbank);
           jf2.add(cretfbankacc);
           jf2.add(cretfbalanceamt);
           jf2.add(cretfcvc);
           jf2.add(cretfinterestrate);
           jf2.add(crecbexpdate);
           jf2.add(crebtncancel);
           jf2.add(crebtnsetcred);
           jf2.add(crebtndisplay);
           jf2.add(crebtnclear);
           jf2.add(crebtnaddcred);
           jf2.add(jcclientname);
           
           Color c= new Color(126, 189, 240);
           jf2.getContentPane().setBackground(c);
           jf2.setVisible(true);
           jf2.setLayout(null);
           jf2.setBounds(300,30,940,779);
           jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           jf2.setResizable(false);
       }
       else if(e.getSource()==banbtdeb)
       {
           jf3= new JFrame("Debit Card");
           
           debcardid=new JLabel("Card Id : ");
           debclientname=new JLabel("Client Name :");
           debissuerbank=new JLabel("Issuer Bank :");
           debbankacc=new JLabel("Bank Account :");
           debbalanceamt=new JLabel("Balance Amount :");
           debpinnumber= new JLabel("Pin Number :");
           
           debtfcardid= new JTextField(bantfcardid.getText());
           debtfclientname= new JTextField(bantfclientname.getText());
           debtfissuerbank= new JTextField(bantfissuerbank.getText());
           debtfbankacc= new JTextField(bantfbankacc.getText());
           debtfbalanceamt= new JTextField(bantfbalanceamt.getText());
           debtfpinnumber= new JTextField();
           
           debbtnwithdraw= new JButton("Withdraw from Debit Card");
           debbtnclear= new JButton("Clear");
           debbtndisplay= new JButton("Display");
           debbtnadddebit= new JButton("Add Debit Card");
           
           debbtnwithdraw.addActionListener(this);
           debbtnclear.addActionListener(this);
           debbtndisplay.addActionListener(this);
           debbtnadddebit.addActionListener(this);
           
           debcardid.setFont(new Font("Regular", Font.PLAIN, 22));
           debclientname.setFont(new Font("Regular", Font.PLAIN, 22));
           debissuerbank.setFont(new Font("Regular", Font.PLAIN, 22));
           debbankacc.setFont(new Font("Regular", Font.PLAIN, 22));
           debbalanceamt.setFont(new Font("Regular", Font.PLAIN, 22));
           debpinnumber.setFont(new Font("Regular", Font.PLAIN, 22));
           
           debcardid.setBounds(210,110,100,40);
           debclientname.setBounds(210,188,148,40);
           debissuerbank.setBounds(210,266,143,40);
           debbankacc.setBounds(210,339,163,40);
           debbalanceamt.setBounds(210,412,189,40);
           debpinnumber.setBounds(210,485,163,40);
           
           debtfcardid.setBounds(409,118,363,32);
           debtfclientname.setBounds(409,202,363,32);
           debtfissuerbank.setBounds(409,274,363,32);
           debtfbankacc.setBounds(409,346,363,32);
           debtfbalanceamt.setBounds(409,420,363,32);
           debtfpinnumber.setBounds(409,493,363,32);
           
           debbtndisplay.setBounds(28,651,197,48);
           debbtnwithdraw.setBounds(709,651,197,48);
           debbtnclear.setBounds(372,651,197,48);
           debbtnadddebit.setBounds(372,558,197,48);
           
           jf3.add(debcardid);
           jf3.add(debclientname);
           jf3.add(debissuerbank);
           jf3.add(debbankacc);
           jf3.add(debbalanceamt);
           jf3.add(debpinnumber);
           jf3.add(debtfcardid);
           jf3.add(debtfclientname);
           jf3.add(debtfissuerbank);
           jf3.add(debtfbankacc);
           jf3.add(debtfbalanceamt);
           jf3.add(debtfpinnumber);
           jf3.add(debbtndisplay);
           jf3.add(debbtnwithdraw);
           jf3.add(debbtnclear);
           jf3.add(debbtnadddebit);
           jf3.add(jcclientname);
           
           Color c= new Color(126, 189, 240);
           jf3.getContentPane().setBackground(c);
           jf3.setVisible(true);
           jf3.setLayout(null);
           jf3.setBounds(300,30,940,737);
           jf3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           jf3.setResizable(false);
       }
       else if(e.getSource()==banbtclear)
       {
            bantfcardid.setText("");
            bantfclientname.setText("");
            bantfissuerbank.setText("");
            bantfbankacc.setText("");
            bantfbalanceamt.setText("");
       }
       else if(e.getSource()==debbtnwithdraw)
       {
          jf4= new JFrame("Withdraw from Debit Card");
          
          wdcardid= new JLabel("Card Id :");
          wdpinnumber= new JLabel("Pin Number:");
          wdwithdrawlamt= new JLabel("Withdrawl Amount :");
          wddateofwith= new JLabel("Date of Withdrawl :");
          
          wdtfcardid= new JTextField();
          wdtfpinnumber= new JTextField();
          wdtfwithdrawlamt= new JTextField();
          
          String dow[]={"2013-02-02","2018-09-09","2020-09-07","2022-09-08"};
          
          wdcbdateofwith= new JComboBox(dow);
          
          wdbtnclear= new JButton("Clear");
          wdbtndisplay=new JButton("Display");
          wdbtnwith= new JButton("Withdraw");
          
          wdbtnclear.addActionListener(this);
          wdbtndisplay.addActionListener(this);
          wdbtnwith.addActionListener(this);
          
          wdcardid.setFont(new Font("Regular", Font.PLAIN, 22));
          wdpinnumber.setFont(new Font("Regular", Font.PLAIN, 22));
          wdwithdrawlamt.setFont(new Font("Regular", Font.PLAIN, 22));
          wddateofwith.setFont(new Font("Regular", Font.PLAIN, 22));
          
          wdcardid.setBounds(194,79,95,40);
          wdwithdrawlamt.setBounds(194,145,219,40);
          wddateofwith.setBounds(194,211,211,40);
          wdpinnumber.setBounds(194,277,143,40);
          
          wdtfcardid.setBounds(424,87,363,32);
          wdtfpinnumber.setBounds(424,153,363,32);
          wdcbdateofwith.setBounds(424,211,363,32);
          wdtfwithdrawlamt.setBounds(424,277,363,32);
          wdbtndisplay.setBounds(29,440,197,48);
          wdbtnclear.setBounds(699,440,197,48);
          wdbtnwith.setBounds(354,353,197,48);
          
          wdbtnclear.addActionListener(this);
          
          jf4.add(wdcardid);
          jf4.add(wdwithdrawlamt);
          jf4.add(wddateofwith);
          jf4.add(wdpinnumber);
          jf4.add(wdtfcardid);
          jf4.add(wdtfpinnumber);
          jf4.add(wdcbdateofwith);
          jf4.add(wdtfwithdrawlamt);
          jf4.add(wdbtndisplay);
          jf4.add(wdbtnclear);
          jf4.add(wdbtnwith);
          jf4.add(jcclientname);
          
          
          Color c= new Color(126, 189, 240);
          jf4.getContentPane().setBackground(c);
          jf4.setVisible(true);
          jf4.setLayout(null);
          jf4.setBounds(300,30,940,542);
          jf4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          jf4.setResizable(false);
       }
       else if(e.getSource()==crebtnsetcred)
       {
           jf5= new JFrame("Set Credit Limit");
           
           setcardid= new JLabel("Card Id :");
           setcreditlimit= new JLabel("Credit Limit :");
           setgraceperiod= new JLabel("Grace Period :");
           
           settfcardid= new JTextField();
           settfcreditlimit= new JTextField();
           settfgrace= new JTextField();
           
           setbtnclear= new JButton("Clear");
           setbtndisplay= new JButton("Display");
           setbtcrlm= new JButton("Set Credit Limit");
           
           setbtnclear.addActionListener(this);
           setbtndisplay.addActionListener(this);
           setbtcrlm.addActionListener(this);
           
           setcardid.setFont(new Font("Regular", Font.PLAIN, 22));
           setcreditlimit.setFont(new Font("Regular", Font.PLAIN, 22));
           setgraceperiod.setFont(new Font("Regular", Font.PLAIN, 22));
           
           setcardid.setBounds(163,89,95,40);
           setcreditlimit.setBounds(163,155,141,40);
           setgraceperiod.setBounds(163,229,160,40);
          
           settfcardid.setBounds(323,97,363,32);
           settfcreditlimit.setBounds(323,163,363,32);
           settfgrace.setBounds(323,237,363,32);
           
           setbtndisplay.setBounds(21,369,197,48);
           setbtnclear.setBounds(703,369,197,48);
           setbtcrlm.setBounds(342,311,197,48);
           
           jf5.add(setcardid);
           jf5.add(setcreditlimit);
           jf5.add(setgraceperiod);
           jf5.add(settfcardid);
           jf5.add(settfgrace);
           jf5.add(settfcreditlimit);
           jf5.add(setbtndisplay);
           jf5.add(setbtnclear);
           jf5.add(setbtcrlm);
           jf5.add(jcclientname);
           
           Color c= new Color(126, 189, 240);
           jf5.getContentPane().setBackground(c);
           jf5.setVisible(true);
           jf5.setLayout(null);
           jf5.setBounds(300,30,920,462);
           jf5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           jf5.setResizable(false);
       }
       else if(e.getSource()==crebtncancel)
       {
           jf6= new JFrame("Cancel Credit Card");
           
           cancclientid= new JLabel("Card Id :");
           
           canctfclientname= new JTextField();
           
           cancbtcancred= new JButton("Cancel Credit Card");
           
           cancbtcancred.addActionListener(this);

           
           cancclientid.setFont(new Font("Regular", Font.PLAIN, 22));
           
           cancclientid.setBounds(128,99,95,40);
           canctfclientname.setBounds(257,103,363,40);
           cancbtcancred.setBounds(257,194,197,48);
           
           jf6.add(cancclientid);
           jf6.add(cancbtcancred);
           jf6.add(canctfclientname);
           jf6.add(jcclientname);
                      
           Color c= new Color(126, 189, 240);
           jf6.getContentPane().setBackground(c);
           jf6.setVisible(true);
           jf6.setLayout(null);
           jf6.setBounds(300,30,751,312);
           jf6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           jf6.setResizable(false);
       }
       else if(e.getSource()==crebtnclear)
       {
            cretfcardid.setText("");
            cretfclientname.setText("");
            cretfissuerbank.setText("");
            cretfbankacc.setText("");
            cretfbalanceamt.setText("");
            cretfcvc.setText("");
            cretfinterestrate.setText("");
       }
       else if(e.getSource()==debbtnclear)
       {
            debtfcardid.setText("");
            debtfclientname.setText("");
            debtfissuerbank.setText("");
            debtfbankacc.setText("");
            debtfbankacc.setText("");
            debtfpinnumber.setText("");
       }
       else if(e.getSource()==wdbtnclear)
       {
            wdtfcardid.setText("");
            wdtfpinnumber.setText("");
            wdtfwithdrawlamt.setText("");
       }
       else if(e.getSource()==setbtnclear)
       {
            settfcardid.setText("");
            settfgrace.setText("");
            settfcreditlimit.setText("");
       }
       else if(e.getSource()==debbtnadddebit)
       {
           if(debtfcardid.getText().isEmpty()  || debtfclientname.getText().isEmpty() || debtfissuerbank.getText().isEmpty() || debtfbankacc.getText().isEmpty() || debtfbalanceamt.getText().isEmpty() || debtfpinnumber.getText().isEmpty() )
           {
                JOptionPane.showMessageDialog(jf3,"Empty field detected, please re-check it.","Alert",JOptionPane.ERROR_MESSAGE);
           }
           else
           {
               try{
                   dcardid= Integer.parseInt(debtfcardid.getText());
                   dpinnumber= Integer.parseInt(debtfpinnumber.getText());
                   dbalanceamt= Integer.parseInt(debtfbalanceamt.getText());
                   dclientname= debtfclientname.getText();
                   dissuerbank= debtfissuerbank.getText();
                   dbankacc= debtfbankacc.getText();
                   if(al.isEmpty())
                   {
                       DebitCard obj= new DebitCard(dbalanceamt,dcardid,dbankacc,dissuerbank,dclientname,dpinnumber);
                       al.add(obj);
                       JOptionPane.showMessageDialog(jf3,"Data Succesfully entered in the system. Thank You!");
                   }
                   else
                   {
                       for(BankCard cd:al)
                       {
                           if(cd instanceof DebitCard)
                           {
                               //downcast
                               DebitCard debitcard=(DebitCard)cd;
                               if(debitcard.getCardid()==dcardid)
                               {
                                   JOptionPane.showMessageDialog(jf3,"Card Id you've entered already exists. Please recheck it","Alert",JOptionPane.ERROR_MESSAGE);
                               }
                               else
                               {
                                   DebitCard obj= new DebitCard(dbalanceamt,dcardid,dbankacc,dissuerbank,dclientname,dpinnumber);
                                   al.add(obj);
                                   JOptionPane.showMessageDialog(jf3,"Data Succesfully entered in the system. Thank You!");
                               }
                           }
                           else
                           {
                               DebitCard obj= new DebitCard(dbalanceamt,dcardid,dbankacc,dissuerbank,dclientname,dpinnumber);
                               al.add(obj);
                               JOptionPane.showMessageDialog(jf3,"Data Succesfully entered in the system. Thank You!");
                           }
                       }
                   }
               }
        
               catch(NumberFormatException f)
               {
                   JOptionPane.showMessageDialog(jf3,"Cannot convert string into integer","Alert",JOptionPane.ERROR_MESSAGE);
               }
           }
       }
       else if(e.getSource()==crebtnaddcred)
       {
           if(cretfcardid.getText().isEmpty()  || cretfclientname.getText().isEmpty() || cretfissuerbank.getText().isEmpty() || cretfbankacc.getText().isEmpty() || cretfbalanceamt.getText().isEmpty() || cretfcvc.getText().isEmpty() || cretfinterestrate.getText().isEmpty())
           {
                JOptionPane.showMessageDialog(jf2,"Empty field detected, please re-check it.","Alert",JOptionPane.ERROR_MESSAGE);
           }
           else
           {
               try{
                   ccardid= Integer.parseInt(cretfcardid.getText());
                   ccvcnum= Integer.parseInt(cretfcvc.getText());
                   cbalanceamt= Integer.parseInt(cretfbalanceamt.getText());
                   cinterestrate= Double.parseDouble(cretfinterestrate.getText());
                   cclientname= cretfclientname.getText();
                   cissuerbank= cretfissuerbank.getText();
                   cbankacc= cretfbankacc.getText();
                   cexpdate= crecbexpdate.getSelectedItem().toString();
                   if(al.isEmpty())
                   {
                       CreditCard obj1= new CreditCard(ccardid,cclientname,cissuerbank,cbankacc,cbalanceamt,ccvcnum,cinterestrate,cexpdate);
                       al.add(obj1);
                       JOptionPane.showMessageDialog(jf2,"Data Succesfully entered in the system. Thank You!");
                   }
                   else
                   {
                       for(BankCard cd:al)
                       {
                           if(cd instanceof CreditCard)
                           {
                               //downcast
                               CreditCard creditcard=(CreditCard)cd;
                               if(creditcard.getCardid()==ccardid)
                                   {
                                       JOptionPane.showMessageDialog(jf2,"Card Id you've entered already exists. Please recheck it","Alert",JOptionPane.ERROR_MESSAGE);
                                   }
                               else
                                   {
                                       CreditCard obj1= new CreditCard(ccardid,cclientname,cissuerbank,cbankacc,cbalanceamt,ccvcnum,cinterestrate,cexpdate);
                                       al.add(obj1);
                                       JOptionPane.showMessageDialog(jf2,"Data Succesfully entered in the system. Thank You!");
                                   }
                           }
                           else
                           {
                              CreditCard obj1= new CreditCard(ccardid,cclientname,cissuerbank,cbankacc,cbalanceamt,ccvcnum,cinterestrate,cexpdate);
                              al.add(obj1);
                              JOptionPane.showMessageDialog(jf2,"Data Succesfully entered in the system. Thank You!"); 
                           }
                       }
                   }
               }
               catch(NumberFormatException f)
               {
                   JOptionPane.showMessageDialog(jf2,"Cannot convert string into integer","Alert",JOptionPane.ERROR_MESSAGE);
               }
           }
       }
       else if(e.getSource()==wdbtnwith)
       {
           BankCard bc= new DebitCard(dbalanceamt,dcardid,dbankacc,dissuerbank,dclientname,dpinnumber);//upcasting
           DebitCard dc=(DebitCard)bc;//downcasting
           if(wdtfcardid.getText().isEmpty()  || wdtfpinnumber.getText().isEmpty() || wdtfwithdrawlamt.getText().isEmpty())
            {
               JOptionPane.showMessageDialog(jf4,"Empty field detected, please re-check it.","Alert",JOptionPane.ERROR_MESSAGE); 
            }
            else
            {
               try{
                   witcardid= Integer.parseInt(wdtfcardid.getText());
                   witpinnumber= Integer.parseInt(wdtfpinnumber.getText());
                   witwithdrawlamt= Integer.parseInt(wdtfwithdrawlamt.getText());
                   witdateofwith=wdcbdateofwith.getSelectedItem().toString();
                   if(al.isEmpty())
                   {
                       JOptionPane.showMessageDialog(jf4,"No debit card is found. Please add your debit card.","Alert",JOptionPane.ERROR_MESSAGE); 
                   }
                   else
                   {
                       for(BankCard each: al)
                       {
                           if(witcardid==dc.getCardid())
                           {
                               if(witpinnumber==dc.getPinNumber())
                               {
                                   if(witwithdrawlamt<=dc.getBalanceAmount())
                                   {
                                       dc.Withdraw(witwithdrawlamt,witdateofwith,witpinnumber);
                                       JOptionPane.showMessageDialog(jf4,"Data Succesfully entered in the system. Thank You!");
                                   }
                                   else
                                   {
                                       JOptionPane.showMessageDialog(jf4,"You donot have enough balance in your account.Please re-check it.","Alert",JOptionPane.ERROR_MESSAGE);
                                   }
                               }
                               else
                               {
                                  JOptionPane.showMessageDialog(jf4,"Invalid Pin Number entered.Please re-check it.","Alert",JOptionPane.ERROR_MESSAGE); 
                               }
                           }
                           else
                           {
                               JOptionPane.showMessageDialog(jf4,"Invalid Card Id entered.Please re-check it.","Alert",JOptionPane.ERROR_MESSAGE); 
                           }
                       }
                   }
               }
               catch(NumberFormatException f)
               {
                   JOptionPane.showMessageDialog(jf4,"Cannot convert string into integer","Alert",JOptionPane.ERROR_MESSAGE);
               }
            }
       }
       else if(e.getSource()==setbtcrlm)
       {
           BankCard bc= new CreditCard(ccardid,cclientname,cissuerbank,cbankacc,cbalanceamt,ccvcnum,cinterestrate,cexpdate);//upcasting
           CreditCard cc=(CreditCard)bc;//downcasting
           if(settfcardid.getText().isEmpty()  || settfgrace.getText().isEmpty() || settfcreditlimit.getText().isEmpty())
           {
               JOptionPane.showMessageDialog(jf5,"Empty field detected, please re-check it.","Alert",JOptionPane.ERROR_MESSAGE); 
           }
            else
            {
               try{
                   setcrcardid= Integer.parseInt(settfcardid.getText());
                   setcrgrace= Integer.parseInt(settfgrace.getText());
                   setcrcredlimit= Double.parseDouble(settfcreditlimit.getText());
                   for(BankCard each: al)
                   {
                       if(setcrcardid==cc.getCardid())
                       {
                           if(setcrcredlimit<=(2.5*(cc.getBalanceAmount())))
                           {
                               cc.setCreditLimit(setcrcredlimit,setcrgrace);
                               JOptionPane.showMessageDialog(jf5,"Data Succesfully entered in the system. Thank You!");
                           }
                           else
                           {
                               JOptionPane.showMessageDialog(jf5,"You don't have enough balance to be granted that amount of credit.Please re-check it","Alert",JOptionPane.ERROR_MESSAGE);
                           }
                       }
                       else
                       {
                           JOptionPane.showMessageDialog(jf5,"Invalid Card Id entered.Please re-check it.","Alert",JOptionPane.ERROR_MESSAGE); 
                       }
                    }
               }
               catch(NumberFormatException f)
               {
                   JOptionPane.showMessageDialog(jf5,"Cannot convert string into integer","Alert",JOptionPane.ERROR_MESSAGE);
               }
            }
       }
       else if(e.getSource()==debbtndisplay)
       {
            DebitCard obj= new DebitCard(dbalanceamt,dcardid,dbankacc,dissuerbank,dclientname,dpinnumber);
            obj.display();
       }
       else if(e.getSource()==setbtndisplay)
       {
            System.out.println("I am display button");
       }
    }
    public static void main(String[]args)
    {
        new BankGUI();
    }
}