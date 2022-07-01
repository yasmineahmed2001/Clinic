/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import static javafx.beans.binding.Bindings.concat;
import javafx.beans.binding.StringExpression;
import javax.swing.JOptionPane;
import oop_project.*;
/**
 *
 * @author DELL
 */
public class Add_patient extends search_users {

    /**
     * Creates new form Add_patient
     */
    public Add_patient() {
        initComponents();
     this.setSize(950,750);
    }
  public  static String  Name;
  static int  c=0;
    
    static patient[] pa = new patient[80];
    static int i = 0;
 static int y=0;
    void insert_patient(patient p) {
        pa[i] = p;
        i++;
    }
    
    View_Patient v=new View_Patient();
    
    public static  boolean wrongId(String idd){
    for(int j=0;j<i;j++){
     if(idd.equals(pa[j].id)){
       
       return true;
     }  
     }
      return false;
     }
   
    

    static  void delete(String idd){
    for (int j = 0; j < i; j++) {
    if(idd.equals(pa[j].id)){
        
      String a=   pa[j].name=" ";
            String  b = pa[j].address=" "; 
            String c=    pa[j].phone=" ";
            String d=   pa[j].gender=" ";
            String e=     pa[j].age=" ";
             int f=pa[j].token=0;
       
    }
    
    }
    }
    
  public  void search(String idd){
   for (int j = 0; j < i; j++) {
    if(idd.equals(pa[j].id)){
        
      String a=   pa[j].name;
       String b=   pa[j].gender;
       String c=     pa[j].age;
            String  d = pa[j].address; 
            String e=    pa[j].phone;// name gender age add phone token
                      
             int f=pa[j].token;
       View_Patient.ve(a,b,c,d,e,f);

              
        }
       
       }  
 }
  
  public static  String  namepa (String idd){
   for (int j = 0; j < i; j++) {
    if(idd.equals(pa[j].id)){
  
  return pa[j].name;
  }
   }
   return null;
  }
       
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        add = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<String>();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 128, 128));
        jLabel1.setText("ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(550, 120, 21, 30);

        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 128, 128)));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id);
        id.setBounds(600, 120, 160, 28);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 128, 128));
        jLabel2.setText("Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(240, 120, 70, 30);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 128, 128));
        jLabel3.setText("address");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(220, 170, 80, 30);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 128, 128));
        jLabel4.setText("phone");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(520, 170, 70, 30);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 128, 128));
        jLabel5.setText("gender");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(230, 230, 80, 30);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 128, 128));
        jLabel6.setText("age");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(530, 220, 60, 30);

        jButton1.setBackground(new java.awt.Color(0, 128, 128));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add patient");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(331, 310, 170, 39);

        reset.setBackground(new java.awt.Color(0, 128, 128));
        reset.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset);
        reset.setBounds(570, 310, 120, 39);

        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 128, 128)));
        jPanel1.add(name);
        name.setBounds(320, 120, 160, 28);

        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 128, 128)));
        jPanel1.add(add);
        add.setBounds(320, 170, 160, 28);

        phone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 128, 128)));
        jPanel1.add(phone);
        phone.setBounds(600, 170, 160, 28);

        age.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 128, 128)));
        jPanel1.add(age);
        age.setBounds(600, 220, 160, 28);

        gender.setBackground(new java.awt.Color(0, 128, 128));
        gender.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        gender.setForeground(new java.awt.Color(255, 255, 255));
        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "male", "female", " ", " " }));
        jPanel1.add(gender);
        gender.setBounds(330, 220, 120, 36);

        jPanel2.setBackground(new java.awt.Color(0, 128, 128));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Add patient panel");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 102));
        jButton3.setText("back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 990, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        //reset
        id.setText(null);
        name.setText(null);
        add.setText(null);
        phone.setText(null);
        age.setText(null);
        gender.setSelectedItem("male");
        
        
        
        
        
        
    }//GEN-LAST:event_resetActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed


    }//GEN-LAST:event_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(name.getText().trim().isEmpty()||add.getText().trim().isEmpty()||phone.getText().trim().isEmpty()||age.getText().trim().isEmpty()) {
     JOptionPane.showMessageDialog(this,"Text box should not be empty.","Erorr", JOptionPane.ERROR_MESSAGE);           
        }       
        String gen = gender.getSelectedItem().toString();
        age.getText();
        c++;//1
        patient p1 = new patient(id.getText(), name.getText(), add.getText(),phone.getText(),gen ,age.getText(),c);
       insert_patient(p1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Receptionist rr = new Receptionist();
          this.dispose();
        rr.setVisible(true);
 

    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Add_patient ppp = new Add_patient();

        //  ppp.display();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    private javax.swing.JTextField age;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables

  
}
