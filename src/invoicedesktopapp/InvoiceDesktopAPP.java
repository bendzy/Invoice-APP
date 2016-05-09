/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicedesktopapp;
import invoicedesktopapp.Controller.Controller;
import invoicedesktopapp.Model.Model;
import invoicedesktopapp.View.MainFrame;
import java.awt.Font;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import net.miginfocom.swing.MigLayout;
/**
 *
 * @author bendz
 */
public class InvoiceDesktopAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SwingUtilities.invokeLater( new Runnable() {
            @Override
            public void run() {
               runApp();
            }
        });
    }
 
    
    
    public static void runApp() {
       //change default font
        UIManager.put("Label.font", new Font("Arial",Font.BOLD,14));
        UIManager.put("TextField.font", new Font("Arial",Font.BOLD,14));
        /* 
        
        
        */
        
        Model model = new Model();
        MainFrame view = new MainFrame(model);
        Controller controller = new Controller(model,view);
    
    
    }
}
