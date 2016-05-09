/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicedesktopapp.View;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author bendz
 */
public class NewCompany extends JPanel{
    private JLabel lblCompanyName;
    private JLabel lblAdress;
    private JLabel lblCity;
    private JLabel lblZIP;
    private JLabel lblCountry;
    private JLabel lblPhone;
    private JLabel lblEmail;
    private JLabel lblVATnumber;
    
    
    private JTextField txtCompanyName;
    private JTextField txtAdress;
    private JTextField txtCity;
    private JTextField txtZIP;
    private JTextField txtCountry;
    private JTextField txtPhone;
    private JTextField txtEmail;
    private JTextField txtVATnumber;
     private JButton butClear;
    private JButton butEnter;
    
    //GUI FOR ADDING NEW COMPANY TO DATABASE
    
    public NewCompany() {
        MigLayout layout = new MigLayout();
        this.setLayout(layout);
        
        
        this.add(new JLabel("ADD NEW COMPANY TO SYSTEM"),"gapx 80, wrap 40");
        
        this.add(lblCompanyName = new JLabel("COMPANY NAME :"),"gapx 30px");
        this.add(txtCompanyName = new JTextField(10),"wrap 20px");
        
        this.add(lblAdress = new JLabel("ADRESS :"),"gapx 30px");
        this.add(txtAdress = new JTextField(15),"wrap 20px");
        
        this.add(lblCity = new JLabel("CITY :"),"gapx 30px");
        this.add(txtCity = new JTextField(10),"wrap 20px");
        
        this.add(lblZIP = new JLabel("ZIP CODE:"),"gapx 30px");
        this.add(txtZIP = new JTextField(10),"wrap 20px");
        
        this.add(lblCountry = new JLabel("COUNTRY :"),"gapx 30px");
        this.add(txtCountry = new JTextField(10),"wrap 20px");
        
        this.add(lblVATnumber = new JLabel("VAT NUMBER :"),"gapx 30px");
        this.add(txtVATnumber = new JTextField(10),"wrap 20px");
        
        this.add(lblEmail = new JLabel("EMAIL :"),"gapx 30px");
        this.add(txtEmail = new JTextField(15),"wrap 20px");
        
        this.add(lblPhone = new JLabel("PHONE NUMBER :"),"gapx 30px");
        this.add(txtPhone = new JTextField(10),"wrap 20px");
        
        this.add(butEnter = new JButton("Enter new Company"),"gapx 30px");
        this.add(butClear = new JButton("Clear"),"wrap 20px");
        
            //default operations and size
        this.setSize(1000, 1000);
       this.setVisible(true);
        
    }
}
