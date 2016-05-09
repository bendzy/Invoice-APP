/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicedesktopapp.View;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author bendz
 */
public class NewProduct extends JPanel {
    
    private JLabel lblDescripton;
    private JLabel lblName;
    private JLabel lblManufactor;
    private JLabel lblProductNumber;
    private JLabel lblPrice;
    private JLabel lblTax;
    private JLabel lblWarranty;
    private JLabel lblSKU;
    
    

    private JTextArea txtDescription;
    private JTextField txtName;
    private JTextField txtManufactor;
    private JTextField txtProductNumber;
    private JTextField txtPrice;
    private JTextField txtTax;
    private JTextField txtWarranty;
    private JTextField txtSKU;
    private JScrollPane scrollpane;
    private JButton butEneterProduct;
    private JButton butClearProduct;
    

    //GUI FOR ADDING NEW PRODUCT TO DATABASE 
    public NewProduct() {
        MigLayout layout = new MigLayout();
        this.setLayout(layout);
        
        this.add(new JLabel("ADD NEW PRODUCT TO SYSTEM"),"gapx 80, wrap 40");
        
        this.add(lblManufactor = new JLabel("MANUFACTURER :"),"gapx 30px");
        this.add(txtManufactor = new JTextField(10),"wrap 20px");
        
        this.add(lblName = new JLabel("NAME :"),"gapx 30px");
        this.add(txtName = new JTextField(10),"wrap 20px");
        
        this.add(lblDescripton = new JLabel("DESCRIPTION :"),"gapx 30px");
        this.add(txtDescription = new JTextArea(6,15));
        this.add(scrollpane = new JScrollPane(txtDescription),"wrap 20px");
        
        this.add(lblProductNumber = new JLabel("PRODUCT NUMBER :"),"gapx 30px");
        this.add(txtProductNumber = new JTextField(10),"wrap 20px");
        
        this.add(lblWarranty = new JLabel("WARRANTY :"),"gapx 30px");
        this.add(txtWarranty = new JTextField(10),"wrap 20px");
        
        this.add(lblPrice = new JLabel("PRICE :"),"gapx 30px");
        this.add(txtPrice = new JTextField(10),"wrap 20px");
    
        this.add(lblTax = new JLabel("TAX :"),"gapx 30px");
        this.add(txtTax = new JTextField(10),"wrap 20px");
    
        this.add(lblSKU = new JLabel("NUMBER OF PRODUCTS :"),"gapx 30px");
        this.add(txtSKU = new JTextField(10),"wrap 20px");
        
        this.add(butEneterProduct = new JButton("Enter new Product"),"gaPx 30px");
        this.add(butClearProduct = new JButton("CLEAR "));
        
            //default operations and size
        this.setSize(1000, 1000);
       this.setVisible(true);
    }
}
