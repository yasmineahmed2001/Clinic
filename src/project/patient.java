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
public class patient extends Person {
    int token; //rmz
    String  prescription;  
  //  float total_price;        //total tkalef
       
    public patient( String id,String name, String address, String phone,String gender,String age,int token) {
        super(id,name,address,phone,gender,age);
       this.token=token;
       
     // System.out.println(id+name+address+phone);
       
     
      
      
      
      
      
    }
    
    
  
    
    
    
}
