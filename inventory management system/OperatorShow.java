package inventoryproject;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * OperatorShow.java
 *
 * Created on Jul 11, 2011, 2:07:35 PM
 */
/**
 *
 * @author ABC
 */
import java.awt.event.*;
import java.sql.*;
public class OperatorShow extends javax.swing.JFrame {

    /** Creates new form OperatorShow */
    public OperatorShow() {
        initComponents();
        jButton1.addActionListener(new A());
        jButton1.addActionListener(new A());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(350, 190, 0, 0));
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(inventoryproject.InventoryApp.class).getContext().getResourceMap(OperatorShow.class);
        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel1.setName("jLabel1"); // NOI18N

        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N

        jTextField1.setName("jTextField1"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTextArea1.setBackground(resourceMap.getColor("jTextArea1.background")); // NOI18N
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setName("jTextArea1"); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N

        jButton3.setText(resourceMap.getString("jButton3.text")); // NOI18N
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(334, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Main obj = new Main();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    class A implements ActionListener
    {
      public void actionPerformed(ActionEvent e)
      {
        try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/main","root","dellstudio15");
          Statement st = cn.createStatement();
          javax.swing.JButton B = (javax.swing.JButton) e.getSource();
          String sql = "select * from operatorregistry";
          if(B==jButton1)
          {
            sql = sql + " where id="+ jTextField1.getText();
          }
          ResultSet rs = st.executeQuery(sql);
          String data = "ID\t Name\t FName\t DOB\t Sex\t MStatus\t Address\t city\t state\t country\t pin\t phno\t mobileno\t email\t password\t confirmpassword\t";
          while(rs.next())
          {
            data = data + "\n";
            data = data + rs.getString(1) + "\t";
            data = data + rs.getString(2) + "\t";
            data = data + rs.getString(3) + "\t";
            data = data + rs.getString(4) + "\t";
            data = data + rs.getString(5) + "\t";
            data = data + rs.getString(6) + "\t";
            data = data + rs.getString(7) + "\t";
            data = data + rs.getString(8) + "\t";
            data = data + rs.getString(9) + "\t";
            data = data + rs.getString(10) + "\t";
            data = data + rs.getString(11) + "\t";
            data = data + rs.getString(12) + "\t";
            data = data + rs.getString(13) + "\t";
            data = data + rs.getString(14) + "\t";
            data = data + rs.getString(15) + "\t";
            data = data + rs.getString(16) + "\t";
          }
          jTextArea1.setText(data);
        }
        catch(Exception y){
          javax.swing.JOptionPane.showMessageDialog(null, ""+y);
        }
      }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new OperatorShow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
