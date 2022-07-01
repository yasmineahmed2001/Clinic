/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author DELL
 */
public class change_pass extends javax.swing.JFrame {

    /**
     * Creates new form change_pass
     */
    public change_pass() {
        initComponents();
        this.setSize(950,620);
    
    }
static  String newpass;
public String username(){
      String Uname=name.getText();
     return Uname;
     }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chpass = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 128, 128));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Change Password");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\هديل\\Desktop\\ll1 - Copy\\icons oop project\\chpass.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(103, 103, 103))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(64, 64, 64)
                .addComponent(jLabel5)
                .addContainerGap(381, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2);
        jPanel2.setBounds(0, 0, 350, 800);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 128, 128));
        jLabel2.setText("Enter new password");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(380, 220, 210, 30);

        chpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 128, 128)));
        jPanel3.add(chpass);
        chpass.setBounds(610, 220, 160, 28);

        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 128, 128)));
        jPanel3.add(name);
        name.setBounds(610, 160, 160, 28);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 128, 128));
        jLabel3.setText("UserName");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(380, 160, 130, 30);

        jButton1.setBackground(new java.awt.Color(0, 128, 128));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Change Pass");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(530, 310, 230, 39);

        jButton2.setBackground(new java.awt.Color(0, 128, 128));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(760, 490, 90, 33);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, -10, 970, 800);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 968, 589);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          newpass= chpass.getText();
         
       sign_in  in =new sign_in();
       this.dispose();
       in.setVisible(true);
       System.out.println(newpass);
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         sign_in  in =new sign_in();
       this.dispose();
       in.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    
     String display(){
       String pass= chpass.getText();
       System.out.println(chpass.getText());

        //return pass;
     return newpass;
     
     }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println(change_pass.newpass);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new change_pass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField chpass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables


   
   


}


