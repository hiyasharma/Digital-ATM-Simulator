package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener{
    
    
    String query = "";
    JTextField pan, aadhar;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, category, occupation, education, income;
    String formno;
    
    SignupTwo(String formno){
        this.formno= formno;
        setLayout(null);
        
        
        
        setTitle("NEW ACCOUNT APPLICATION FORM- PAGE 2");
        
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        JLabel reli = new JLabel("Religion:");
        reli.setFont(new Font("Raleway", Font.BOLD, 22));
        reli.setBounds(100, 140, 100, 30);
        add(reli);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway", Font.BOLD, 22));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        String valcategory[] = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel inc = new JLabel("Income:");
        inc.setFont(new Font("Raleway", Font.BOLD, 22));
        inc.setBounds(100, 240, 200, 30);
        add(inc);
        String incomecategory[] = {"Null", "< 1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        
  
                
        JLabel edu = new JLabel("Educational:");
        edu.setFont(new Font("Raleway", Font.BOLD, 22));
        edu.setBounds(100, 290, 200, 30);
        add(edu);
        
        
        
        JLabel qual = new JLabel("Qualification:");
        qual.setFont(new Font("Raleway", Font.BOLD, 22));
        qual.setBounds(100, 315, 200, 30);
        add(qual);
        
        String educationValues[] = {"Non-Graduation", "Graduate", "Post-Graduation", "Doctrate", "Others"};
        education = new JComboBox(educationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
       
        JLabel occu = new JLabel("Occupation:");
        occu.setFont(new Font("Raleway", Font.BOLD, 22));
        occu.setBounds(100, 390, 200, 30);
        add(occu);
        
        String occupationValues[] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        
        JLabel p = new JLabel("PAN number:");
        p.setFont(new Font("Raleway", Font.BOLD, 22));
        p.setBounds(100, 440, 200, 30);
        add(p);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
        
        JLabel aad = new JLabel("Aadhar Number:");
        aad.setFont(new Font("Raleway", Font.BOLD, 22));
        aad.setBounds(100, 490, 200, 30);
        add(aad);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);
        
        JLabel sc = new JLabel("Senior Citizen:");
        sc.setFont(new Font("Raleway", Font.BOLD, 22));
        sc.setBounds(100, 540, 200, 30);
        add(sc);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        
        ButtonGroup yn = new ButtonGroup();
        yn.add(syes);
        yn.add(sno);
        
        
        JLabel EA = new JLabel("Existing Account:");
        EA.setFont(new Font("Raleway", Font.BOLD, 22));
        EA.setBounds(100, 590, 200, 30);
        add(EA);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        
        ButtonGroup yne = new ButtonGroup();
        yne.add(eyes);
        yne.add(eno);
        
     
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        } else if(sno.isSelected()){
            seniorcitizen = "No";
        }
        String existingaccount = null;
        if(eyes.isSelected()){
            existingaccount = "Yes";
        } else if (eno.isSelected()){
            existingaccount = "No";
        } 

        
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        
        try {
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingaccount+"')";
                 c.s.executeUpdate(query);
                 //Signup3 object
                 setVisible(false);
                 new SignupThree(formno).setVisible(true);
        } catch (Exception e){
            System.out.println(e);
        }
    
    }
    public static void main(String args[]){
        new SignupTwo("");
    }
}

