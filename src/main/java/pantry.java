
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author namyaaankurgupta
 */
public class pantry extends javax.swing.JFrame {

    public pantry() {
        initComponents();
    }
    public void cost(){
        int tot_cost=0;
        for(int i=0; i< jTable.getRowCount();i++){
            if(jTable.getValueAt(i, 0).equals("Packet of Flour (₹ 30)")){
                int x= 0;
                x= x+ Integer.parseInt(jTable.getValueAt(i, 1).toString());
                int cost1= x* 30;
                tot_cost+= cost1;
            }
            else if(jTable.getValueAt(i, 0).equals("Vegetables (₹ 100)")){
                int x= 0;
                x= x+ Integer.parseInt(jTable.getValueAt(i, 1).toString());
                int cost2= x* 100;
                tot_cost+= cost2;
            }
            else if(jTable.getValueAt(i, 0).equals("Cornflour (₹ 30)")){
                int x= 0;
                x= x+ Integer.parseInt(jTable.getValueAt(i, 1).toString());
                int cost3= x* 30;
                tot_cost+= cost3;
            }
            else if(jTable.getValueAt(i, 0).equals("Box of Baking soda(₹ 20)")){
                int x= 0;
                x= x+ Integer.parseInt(jTable.getValueAt(i, 1).toString());
                int cost4= x* 20;
                tot_cost+= cost4;
            }
            else if(jTable.getValueAt(i, 0).equals("Vanilla Essence (₹ 20)")){
                int x= 0;
                x= x+ Integer.parseInt(jTable.getValueAt(i, 1).toString());
                int cost5= x* 20;
                tot_cost+= cost5;
            }
            else if(jTable.getValueAt(i, 0).equals("Sugar (₹ 40)")){
                int x= 0;
                x= x+ Integer.parseInt(jTable.getValueAt(i, 1).toString());
                int cost6= x* 40;
                tot_cost+= cost6;
            }
            else if(jTable.getValueAt(i, 0).equals("Salt (₹ 40)")){
                int x= 0;
                x= x+ Integer.parseInt(jTable.getValueAt(i, 1).toString());
                int cost7= x* 40;
                tot_cost+= cost7;
            }
            else if(jTable.getValueAt(i, 0).equals("Spices (₹ 50)")){
                int x= 0;
                x= x+ Integer.parseInt(jTable.getValueAt(i, 1).toString());
                int cost8= x* 50;
                tot_cost+= cost8;
            }
            else if(jTable.getValueAt(i, 0).equals("Cheese (₹ 70)")){
                int x= 0;
                x= x+ Integer.parseInt(jTable.getValueAt(i, 1).toString());
                int cost9= x* 70;
                tot_cost+= cost9;
            }
            else if(jTable.getValueAt(i, 0).equals("Eggs (₹ 40)")){
                int x= 0;
                x= x+ Integer.parseInt(jTable.getValueAt(i, 1).toString());
                int cost10= x* 40;
                tot_cost+= cost10;
            }
            else if(jTable.getValueAt(i, 0).equals("Fruits (₹ 150)")){
                int x= 0;
                x= x+ Integer.parseInt(jTable.getValueAt(i, 1).toString());
                int cost11= x* 150;
                tot_cost+= cost11;
            }
        }
        total.setText(Integer.toString(tot_cost));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ingredient = new javax.swing.JComboBox<>();
        quantity = new javax.swing.JComboBox<>();
        back = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        total = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(227, 147, 115));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(157, 25, 77));
        jLabel1.setText("READY CHEF BAKE PANTRY");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jLabel2.setText("INGREDIENT: ");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jLabel3.setText("QUANTITY: ");

        ingredient.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        ingredient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "Packet of Flour (₹ 30)", "Vegetables (₹ 100)", "Cornflour (₹ 30)", "Box of Baking soda(₹ 20)", "Vanilla Essence (₹ 20)", "Sugar (₹ 40)", "Salt (₹ 40)", "Spices (₹ 50)", "Cheese (₹ 70)", "Eggs (₹ 40)", "Fruits (₹ 150)", " " }));
        ingredient.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ingredient.setSize(new java.awt.Dimension(96, 29));

        quantity.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        quantity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        back.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(171, 49, 85));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(171, 49, 85));
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jTable.setBackground(new java.awt.Color(171, 49, 85));
        jTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTable.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jTable.setForeground(new java.awt.Color(255, 255, 255));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        total.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(171, 49, 85));
        jButton1.setText("TOTAL COST");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(171, 49, 85));
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(33, 33, 33)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingredient, 0, 1, Short.MAX_VALUE)
                    .addComponent(quantity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingredient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new cookingcorner().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model= (DefaultTableModel)jTable.getModel();
        model.addRow(new Object[]{
            ingredient.getSelectedItem(), quantity.getSelectedItem()
        });
        
    }//GEN-LAST:event_addActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cost();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(jTable.getSelectedRow() != -1) {
               // remove selected row from the model
                int a=JOptionPane.showConfirmDialog(null,"Are you sure?");  
                if(a==JOptionPane.YES_OPTION){  
                 DefaultTableModel model= (DefaultTableModel)jTable.getModel();
                 model.removeRow(jTable.getSelectedRow());
                JOptionPane.showMessageDialog(null, "Selected row deleted successfully"); 
       }  
               
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pantry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> ingredient;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable;
    private javax.swing.JComboBox<String> quantity;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
