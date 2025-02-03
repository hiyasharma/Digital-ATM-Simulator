package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{
    
    JButton deposit, withdrawl, ministatement, pinchange, fastcash, balanceenquiry, exit;
    String pinnumber;
    Transactions(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(235, 335, 700, 35);
        text.setForeground(Color.BLACK);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(230, 400, 135, 25);
        deposit.setBackground(Color.DARK_GRAY);
        deposit.setForeground(Color.WHITE);
        deposit.addActionListener(this);
        image.add(deposit);

        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(400, 400, 135, 25);
        withdrawl.setBackground(Color.DARK_GRAY);
        withdrawl.setForeground(Color.WHITE);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(230, 435, 135, 25);
        fastcash.setBackground(Color.DARK_GRAY);
        fastcash.setForeground(Color.WHITE);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(400, 430, 135, 25);
        ministatement.setBackground(Color.DARK_GRAY);
        ministatement.setForeground(Color.WHITE);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange = new JButton("Pin Change");
        pinchange.setBounds(230, 470, 135, 25);
        pinchange.setBackground(Color.DARK_GRAY);
        pinchange.setForeground(Color.WHITE);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceenquiry = new JButton("Balance Enquiry");
        balanceenquiry.setBounds(400, 460, 135, 25);
        balanceenquiry.setBackground(Color.DARK_GRAY);
        balanceenquiry.setForeground(Color.WHITE);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
        exit = new JButton("Exit");
        exit.setBounds(400, 490, 135, 25);
        exit.setBackground(Color.DARK_GRAY);
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        image.add(exit);
        
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == exit){
            System.exit(0);
        } else if(ae.getSource() == deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        } else if (ae.getSource() == withdrawl){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        } else if(ae.getSource() == fastcash){
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        } else if(ae.getSource() ==  pinchange){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }  else if(ae.getSource() == balanceenquiry){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        } else if(ae.getSource() == ministatement){
            
            new MiniStatement(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String args[]){
        
    
        new Transactions(" ");
    }
}
