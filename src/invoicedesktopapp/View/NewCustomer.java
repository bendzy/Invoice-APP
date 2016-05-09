/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicedesktopapp.View;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
/**
 *
 * @author bendz
 */
public class NewCustomer extends JPanel {
    
     //****** ADD NEW CUSTOMER SECTION *****//
    /*THIS CLASS SERVES AS SMALL SECTION IN MAINFRAME TO ADD NEW 
    CUSTOMER TO DATABASE, WHICH CAN BE LATER REFERED TO INVOICE / BILL BLABLABLA*/
    
    private JLabel lblFirstName;
    private JLabel lblLastName;
    private JLabel lblAdress;
    private JLabel lblEmail;
    private JLabel lblCompany;
    private JLabel lblPhone;
    private JLabel lblCity;
    private JLabel lblZIP;
    private JLabel lblCountry;
    private JLabel lblHeading;
    private JButton butClear;
    private JButton butEnter;
    
    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JTextField txtAdress;
    private JTextField txtEmail;
    private JTextField txtCompany;
    private JTextField txtCity;
    private JTextField txtZIP;
    private JTextField txtPhone;
    private JTextField txtCountry;
    
      
    //GUI FOR ADDING NEW CUSTOMER TO DATABASE
    
    public NewCustomer() {
        MigLayout layout = new MigLayout();
        this.setLayout(layout);
        
        this.add(lblHeading = new JLabel("ADD A NEW CUSTOMER :"),"WRAP 40px, gapx 80px");
        this.lblHeading.setHorizontalAlignment(SwingConstants.CENTER);
        
        this.add(lblFirstName = new JLabel("FIRST NAME :"),"gapx 30px");
        this.add(txtFirstName = new JTextField(10),"WRAP 20px");
        
        this.add(lblLastName = new JLabel("LAST NAME :"),"gapx 30px");
        this.add(txtLastName = new JTextField(10),"wrap 20px");
        
        this.add(lblAdress = new JLabel("ADRESS :"),"gapx 30px");
        this.add(txtAdress = new JTextField(15),"wrap 20px");
        
        this.add(lblCity = new JLabel("CITY :"),"gapx 30px");
        this.add(txtCity = new JTextField(10),"wrap 20px");
        
        this.add(lblZIP = new JLabel("ZIP :"),"gapx 30px");
        this.add(txtZIP = new JTextField(10),"wrap 20px");
        
        this.add(lblCountry = new JLabel("COUNTRY :"),"gapx 30px");
        this.add(txtCountry = new JTextField(10),"wrap 20px");
        
        this.add(lblEmail = new JLabel("EMAIL :"),"gapx 30px");
        this.add(txtEmail = new JTextField(15),"wrap 20px");
        
        this.add(lblPhone = new JLabel("PHONE NUMBER :"),"gapx 30px");
        this.add(txtPhone = new JTextField(10),"wrap 20px");
        
        this.add(lblCompany = new JLabel("COMPANY :"),"gapx 30px");
        this.add(txtCompany = new JTextField(10),"wrap 40px");
        
        this.add(butEnter = new JButton("Add new Customer"),"gapx 30px");
        this.add(butClear = new JButton("Clear"));
        
       
        
        //default operations and size
        this.setSize(1000, 1000);
       this.setVisible(true);
        
    }
    
}
