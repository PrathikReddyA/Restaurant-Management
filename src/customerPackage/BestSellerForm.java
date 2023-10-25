/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerPackage;

import java.awt.Color;
import static java.awt.Color.blue;
import static java.awt.Color.green;
import static java.awt.Color.red;
import java.util.ArrayList;
import java.util.Collections;
import menuItems.Inventory;
import menuItems.MainMenu;
import menuItems.Menu;
import menuItems.MenuItem;
import starting.HomepageForm;

/**
 *
 * @author prathik reddy arasu
 */
public class BestSellerForm extends javax.swing.JFrame
{

    /**
     * Creates new form BestSellerForm
     */
    Customer customer;
    String orderinString;

    public BestSellerForm()
    {
        initComponents();
        initComp();
    }

    public BestSellerForm(Customer customer, String orderinString)
    {
        this.customer = customer;
        this.orderinString = orderinString;
        initComponents();
        initComp();
    }
    private void initComp()
    {
        /*jTextArea1.setOpaque(false);
        jTextArea1.setBackground(new Color(red, green, blue, alpha));


       jScrollPane1.getViewport().setOpaque(false);
       jScrollPane1.setOpaque(false);*/
       
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0, 0));
        
        jTextArea1.append("\n");
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0, 0));
        this.setLocationRelativeTo(null); //center form in screen
        Customer.viewBestSellers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        pHeader = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        lbLogo = new javax.swing.JLabel();
        btnOrdersCustomer = new javax.swing.JButton();
        btnMakeOrderCustomer = new javax.swing.JButton();
        btnMenuCustomer = new javax.swing.JButton();
        btnBestSellersCustomer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1217, 871));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1217, 871));
        getContentPane().setLayout(null);

        jScrollPane1.setBorder(null);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Rockwell Condensed", 0, 34)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jTextArea1.setSelectionColor(new java.awt.Color(255, 204, 102));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 80, 1090, 790);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/Pic/best2.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 50, 1220, 850);

        pHeader.setBackground(new java.awt.Color(255, 213, 0));
        pHeader.setName("pHeader"); // NOI18N
        pHeader.setPreferredSize(new java.awt.Dimension(1062, 70));
        pHeader.setLayout(null);

        btnLogout.setBackground(new java.awt.Color(255, 213, 0));
        btnLogout.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(127, 72, 101));
        btnLogout.setText("Log out");
        btnLogout.setToolTipText("");
        btnLogout.setBorder(null);
        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.setName(""); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        pHeader.add(btnLogout);
        btnLogout.setBounds(1080, 19, 101, 40);

        lbLogo.setBackground(new java.awt.Color(255, 255, 255));
        lbLogo.setFont(new java.awt.Font("Rockwell Condensed", 0, 52)); // NOI18N
        lbLogo.setForeground(new java.awt.Color(127, 72, 101));
        lbLogo.setText("Khake-Jao");
        lbLogo.setToolTipText("");
        pHeader.add(lbLogo);
        lbLogo.setBounds(30, 10, 120, 62);

        btnOrdersCustomer.setBackground(new java.awt.Color(255, 213, 0));
        btnOrdersCustomer.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnOrdersCustomer.setForeground(new java.awt.Color(127, 72, 101));
        btnOrdersCustomer.setText("My Orders");
        btnOrdersCustomer.setBorder(null);
        btnOrdersCustomer.setBorderPainted(false);
        btnOrdersCustomer.setContentAreaFilled(false);
        btnOrdersCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdersCustomer.setPreferredSize(new java.awt.Dimension(87, 29));
        btnOrdersCustomer.setRequestFocusEnabled(false);
        btnOrdersCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdersCustomerActionPerformed(evt);
            }
        });
        pHeader.add(btnOrdersCustomer);
        btnOrdersCustomer.setBounds(901, 26, 184, 29);

        btnMakeOrderCustomer.setBackground(new java.awt.Color(255, 213, 0));
        btnMakeOrderCustomer.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnMakeOrderCustomer.setForeground(new java.awt.Color(127, 72, 101));
        btnMakeOrderCustomer.setText("Make Order");
        btnMakeOrderCustomer.setBorder(null);
        btnMakeOrderCustomer.setBorderPainted(false);
        btnMakeOrderCustomer.setContentAreaFilled(false);
        btnMakeOrderCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMakeOrderCustomer.setPreferredSize(new java.awt.Dimension(87, 29));
        btnMakeOrderCustomer.setRequestFocusEnabled(false);
        btnMakeOrderCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeOrderCustomerActionPerformed(evt);
            }
        });
        pHeader.add(btnMakeOrderCustomer);
        btnMakeOrderCustomer.setBounds(750, 20, 170, 40);

        btnMenuCustomer.setBackground(new java.awt.Color(255, 213, 0));
        btnMenuCustomer.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnMenuCustomer.setForeground(new java.awt.Color(127, 72, 101));
        btnMenuCustomer.setText("Main Menu");
        btnMenuCustomer.setBorder(null);
        btnMenuCustomer.setBorderPainted(false);
        btnMenuCustomer.setContentAreaFilled(false);
        btnMenuCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuCustomer.setPreferredSize(new java.awt.Dimension(87, 29));
        btnMenuCustomer.setRequestFocusEnabled(false);
        btnMenuCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuCustomerActionPerformed(evt);
            }
        });
        pHeader.add(btnMenuCustomer);
        btnMenuCustomer.setBounds(430, 20, 153, 40);

        btnBestSellersCustomer.setBackground(new java.awt.Color(255, 213, 0));
        btnBestSellersCustomer.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnBestSellersCustomer.setForeground(new java.awt.Color(127, 72, 101));
        btnBestSellersCustomer.setText("Best Selling");
        btnBestSellersCustomer.setBorder(null);
        btnBestSellersCustomer.setBorderPainted(false);
        btnBestSellersCustomer.setContentAreaFilled(false);
        btnBestSellersCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBestSellersCustomer.setPreferredSize(new java.awt.Dimension(87, 29));
        btnBestSellersCustomer.setRequestFocusEnabled(false);
        btnBestSellersCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBestSellersCustomerActionPerformed(evt);
            }
        });
        pHeader.add(btnBestSellersCustomer);
        btnBestSellersCustomer.setBounds(590, 20, 153, 40);

        getContentPane().add(pHeader);
        pHeader.setBounds(0, 0, 1220, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLogoutActionPerformed
    {//GEN-HEADEREND:event_btnLogoutActionPerformed
        HomepageForm homepage = new HomepageForm(true);
        homepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnOrdersCustomerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnOrdersCustomerActionPerformed
    {//GEN-HEADEREND:event_btnOrdersCustomerActionPerformed
        ShowOrders s = new ShowOrders(customer, orderinString);
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrdersCustomerActionPerformed

    private void btnMakeOrderCustomerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMakeOrderCustomerActionPerformed
    {//GEN-HEADEREND:event_btnMakeOrderCustomerActionPerformed
        // TODO add your handling code here:
        OrderForm o = new OrderForm(customer, orderinString);
        o.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMakeOrderCustomerActionPerformed

    private void btnMenuCustomerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMenuCustomerActionPerformed
    {//GEN-HEADEREND:event_btnMenuCustomerActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_btnMenuCustomerActionPerformed

    private void btnBestSellersCustomerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBestSellersCustomerActionPerformed
    {//GEN-HEADEREND:event_btnBestSellersCustomerActionPerformed
        BestSellerForm b= new BestSellerForm(customer, orderinString);
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBestSellersCustomerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(BestSellerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(BestSellerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(BestSellerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(BestSellerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new BestSellerForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBestSellersCustomer;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMakeOrderCustomer;
    private javax.swing.JButton btnMenuCustomer;
    private javax.swing.JButton btnOrdersCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    static javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbLogo;
    public static javax.swing.JPanel pHeader;
    // End of variables declaration//GEN-END:variables
}
