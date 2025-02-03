package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
    
    JButton deposit, withdrawl, ministatement, pinchange, fastcash, balanceenquiry, exit;
    String pinnumber;
    FastCash(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(235, 335, 700, 35);
        text.setForeground(Color.BLACK);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
        
        deposit = new JButton("Rs 100");
        deposit.setBounds(230, 400, 135, 25);
        deposit.setBackground(Color.DARK_GRAY);
        deposit.setForeground(Color.WHITE);
        deposit.addActionListener(this);
        image.add(deposit);

        withdrawl = new JButton("Rs 500");
        withdrawl.setBounds(400, 400, 135, 25);
        withdrawl.setBackground(Color.DARK_GRAY);
        withdrawl.setForeground(Color.WHITE);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash = new JButton("Rs 1000");
        fastcash.setBounds(230, 435, 135, 25);
        fastcash.setBackground(Color.DARK_GRAY);
        fastcash.setForeground(Color.WHITE);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement = new JButton("Rs 2000");
        ministatement.setBounds(400, 430, 135, 25);
        ministatement.setBackground(Color.DARK_GRAY);
        ministatement.setForeground(Color.WHITE);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange = new JButton("Rs 5000");
        pinchange.setBounds(230, 470, 135, 25);
        pinchange.setBackground(Color.DARK_GRAY);
        pinchange.setForeground(Color.WHITE);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceenquiry = new JButton("Rs 10000");
        balanceenquiry.setBounds(400, 460, 135, 25);
        balanceenquiry.setBackground(Color.DARK_GRAY);
        balanceenquiry.setForeground(Color.WHITE);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
        exit = new JButton("BACK");
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
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        } else{
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            Conn c = new Conn();
            try{
                    ResultSet rs = c.s.executeQuery("select * from bank where pin= '"+pinnumber+"'" );
                    int balance =0;
                    while(rs.next()){
                        if(rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                        }else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                        }
                      }
                    if(ae.getSource() != exit && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                    }
                    Date date = new Date();
                    String query = "insert into bank values('"+pinnumber+"', '"+date+"', 'withdraw', '"+amount+"')";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs " +amount+ " Debited Sucessfully");
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }
    
    public static void main(String args[]){
        
    
        new FastCash(" ");
    }
}
