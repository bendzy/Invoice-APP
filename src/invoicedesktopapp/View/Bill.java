/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicedesktopapp.View;

import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author bendz
 */
public class Bill extends JPanel{
    
    private JLabel lblCustomerName;
    private JLabel lblOrderDate;
    private JLabel lblOrderTime;
    private JLabel lblExistingCustomer;
    
    private JTextField txtCustomerName;
    private JTextField txtOrderDate;
    private JTextField txtOrderTime;
    private JComboBox comboExistingCustomer;
    
    
    
    private JLabel lblproductType;
    private JLabel lblOty;
    private JLabel lblproductPrice;
    private JLabel lblproductTotalPrice;
    
    private JComboBox comboproduct1;
    private JComboBox comboproduct2;
    private JComboBox comboproduct3;
    
    private JTextField txtoty1;
    private JTextField txtoty2;
    private JTextField txtoty3;
    
    private JTextField txtunitprice1;
    private JTextField txtunitprice2;
    private JTextField txtunitprice3;
    
    private JTextField txtsubtotal1;
    private JTextField txtsubtotal2;
    private JTextField txtsubtotal3;
    
    
    private JLabel lblOrderTotal;
    private JLabel lblTaxPaid;
    private JLabel lblNetPrice;
    private JLabel lblOrderRefNumber;
    private JLabel lblOrderRefNumberValue;
    
    private JButton butTotal;
    private JButton butReset;
    private JButton butDisplay;
    private JButton butExit;
    
    private JTextField txtOrderTotal;
    private JTextField txtTaxPaid;
    private JTextField txtNetPrice;
    
    private JTextArea txtReciept;
    
    
    //panels 
    
    private JPanel firstPanel;
    private JPanel thirdPanel;
    private JPanel forthPanel;
    private JPanel secondPanel;
    public Bill() {
        MigLayout layout = new MigLayout();
        this.setLayout(layout);
      
  /***************************************************************************************/      
        // first panel is for customers order date and time
        firstPanel = new JPanel(new MigLayout());
        
        // 1 line
        firstPanel.add(lblCustomerName = new JLabel("Customer Name :"),"gapx 50px,gaptop 60px");
        firstPanel.add(txtCustomerName = new JTextField(10));
        
        firstPanel.add(lblExistingCustomer = new JLabel("Select Customer :"),"gapx 50px");
        firstPanel.add(comboExistingCustomer = new JComboBox(),"wrap 30px,gaptop 60px");
        
        //2 line
        firstPanel.add(lblOrderDate = new JLabel("Order Date :"),"gapx 50px");
        firstPanel.add(txtOrderDate = new JTextField(10));
           
     
        firstPanel.add(lblOrderTime = new JLabel("Order Time :"),"gapx 50px");
        firstPanel.add(txtOrderTime = new JTextField(10),"wrap 100px");
        
        firstPanel.setBorder(new BevelBorder(BevelBorder.RAISED));
        firstPanel.setBorder(new TitledBorder(new LineBorder(Color.blue, 3)));
  /*************************************************************************************/
        secondPanel = new JPanel(new MigLayout());
        txtReciept = new JTextArea(30,25);
        
        secondPanel.add(txtReciept);
        
        secondPanel.setBorder(new BevelBorder(BevelBorder.RAISED));
        secondPanel.setBorder(new TitledBorder(new LineBorder(Color.black, 5)));
        
        
        
  /*****************************************************************************/      
        //second panel for product name number price total price
        thirdPanel = new JPanel(new MigLayout()); 
       
        
        firstPanel.add(lblproductType = new JLabel("Product Name"),"gapx 50px");
        firstPanel.add(lblOty = new JLabel("Number"),"gapx 50px");
        firstPanel.add(lblproductPrice = new JLabel("Product Price"),"gapx 50px");
        firstPanel.add(lblproductTotalPrice = new JLabel("Total Price"),"gapx 50px, wrap 30px");
        
        firstPanel.add(comboproduct1 = new JComboBox(),"gapx 50");
        firstPanel.add(txtoty1 = new JTextField(10),"gapx 50");
        firstPanel.add(txtunitprice1 = new JTextField(10),"gapx 50");
        firstPanel.add(txtsubtotal1 = new JTextField(10),"gapx 50,wrap 30px");
    
        
        firstPanel.add(comboproduct2 = new JComboBox(),"gapx 50");
        firstPanel.add(txtoty2 = new JTextField(10),"gapx 50");
        firstPanel.add(txtunitprice2 = new JTextField(10),"gapx 50");
        firstPanel.add(txtsubtotal2 = new JTextField(10),"gapx 50,wrap 30px");
  
        firstPanel.add(comboproduct3 = new JComboBox(),"gapx 50px");
        firstPanel.add(txtoty3 = new JTextField(10),"gapx 50px");
        firstPanel.add(txtunitprice3 = new JTextField(10),"gapx 50px");
        firstPanel.add(txtsubtotal3 = new JTextField(10),"gapx 50px,wrap 50px");
        
        
/************************************************************************************/
        forthPanel = new JPanel(new MigLayout());
        forthPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
        
        forthPanel.add(lblOrderTotal = new JLabel("Order Total :"),"gapx 50px");
        forthPanel.add(txtOrderTotal = new JTextField(10),"gapx 50px");
        forthPanel.add(lblOrderRefNumber = new JLabel("Order Ref No :"),"gapx 50px");
        forthPanel.add(lblOrderRefNumberValue = new JLabel("VALUEEE"),"gapx 50px,wrap 20px");
        
        forthPanel.add(lblTaxPaid = new JLabel("Tax Paid :"),"gapx 50px");
        forthPanel.add(txtTaxPaid = new JTextField(10),"gapx 50px, wrap 20px");
        
        forthPanel.add(lblNetPrice = new JLabel("Net Price :"),"gapx 50px");
        forthPanel.add(txtNetPrice = new JTextField(10),"gapx 50px");
        
        
       
        Icon icototal = new ImageIcon("D:\\MY Programming projects\\Invoices\\InvoiceDesktopAPP\\images\\total.png");
        forthPanel.add(butTotal = new JButton("Total"),"span, split 4,align right, gapx 50px"); 
        butTotal.setIcon(icototal);
       
        Icon icoReset = new ImageIcon("D:\\MY Programming projects\\Invoices\\InvoiceDesktopAPP\\images\\reset.png");
        forthPanel.add(butReset = new JButton("Reset")); 
         butReset.setIcon(icoReset);
        
        
        Icon icoDisplay = new ImageIcon("D:\\MY Programming projects\\Invoices\\InvoiceDesktopAPP\\images\\display.png");
        forthPanel.add(butDisplay = new JButton("Display"));
        butDisplay.setIcon(icoDisplay);
        
        
        Icon icoExit = new ImageIcon("D:\\MY Programming projects\\Invoices\\InvoiceDesktopAPP\\images\\exit.png");
        forthPanel.add(butExit = new JButton("Exit"));
        butExit.setIcon(icoExit);
        
/**********************************************************************************/


        this.add(firstPanel,"top,gaptop 25px,span, split 2");
        this.add(secondPanel,"gaptop 25px,wrap 50px");
        
        this.add(thirdPanel,"wrap 50px");
        this.add(forthPanel,"span 2,wrap 20px");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    }
    
    
}
