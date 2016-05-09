/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicedesktopapp.View;

import invoicedesktopapp.Model.Model;
import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import net.miginfocom.swing.MigLayout;


/**
 *
 * @author bendz
 */
public class MainFrame extends JFrame {
    
    private Model model;
    private JPanel container;
    private NewCustomer newCustomer;   
    private NewCompany newCompany;
    private NewProduct newProduct;
    private Bill bill;
    
    private JButton customer;
    private JButton company;
    private JButton product;
    
    public MainFrame( Model model) {
        super("Invoice app by beNdZy");
        this.model = model;
        
        MigLayout layout = new MigLayout();
        container = new JPanel(layout);
       
       // adding icons for new customer, company and product
         Icon c = new ImageIcon("D:\\MY Programming projects\\Invoices\\InvoiceDesktopAPP\\images\\newcustomer.png");
        customer = new JButton(c);
        customer.setText("New Customer");
        
         Icon comp = new ImageIcon("D:\\MY Programming projects\\Invoices\\InvoiceDesktopAPP\\images\\newcompany.png");
         company = new JButton(comp);
         company.setText("New Company");
       
         Icon p = new ImageIcon("D:\\MY Programming projects\\Invoices\\InvoiceDesktopAPP\\images\\newproduct.png");
        product = new JButton(p);
        product.setText("New Product");
               
         
        container.add(customer,"span,split 3, gapx 30px,gaptop 25px");
        container.add(company,"gapx 30px,gaptop 25px");
        container.add(product,"gapx 30px,wrap 20px,gaptop 25px");
        
         
        //default font
        
      
        //Add new customer to the mainframe//
        newCustomer = new NewCustomer();
        container.add(newCustomer);
        
        
        //Add new company to the mainframe
        newCompany = new NewCompany();
        container.add(newCompany);
        
        
        //ADD NEW PRODUCT to mainframe
        newProduct = new NewProduct();
        container.add(newProduct);
        
        //add new billing
        
        bill = new Bill();
        container.add(bill);
        
        
       this.setSize(1000,500);
       this.add(container);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.pack();
       this.setVisible(true);
    }
    
}
