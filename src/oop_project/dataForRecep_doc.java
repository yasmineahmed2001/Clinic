/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

import project.Person;

/**
 *
 * @author هديل
 */
public class dataForRecep_doc extends Person{
         public String jopType;
         public String username;
         public String password;
    public dataForRecep_doc(String id, String name, String address, String phone, String gender, String age, String jop, String usernam, String pass) {
        super(id, name, address, phone, gender, age);
        
           jopType=jop;
          username=usernam;
          password=pass;
        
    }

    
}
