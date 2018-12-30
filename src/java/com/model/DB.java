/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.model.person;
import com.model.treatment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author houdavic
 */
public class DB {

    public static Connection con = null;
    private static Statement st = null;
    private static  ResultSet rs = null;

    
    public static void open_Connection() throws SQLException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        
        
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        
               if (con == null) {
            
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","");
         
               }
         
               
    }
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","");
    }
    public static ResultSet login(String username , String password) throws ClassNotFoundException, SQLException {
        
        st = con.createStatement();
        
        String sql = "select *  from  `person` where `username` = '"+username+"' and `password`='"+password+"'";
        ResultSet rs = st.executeQuery(sql);
        
       return rs;
       
    }
    

    public static boolean add_person(person person) throws ClassNotFoundException, SQLException {

        st = con.createStatement();
        
        String sql ;
        sql = "INSERT INTO `person`(`ssn`, `fname`, `lname`, `username`, `password`, `email`, `salary`, `workhour`, `type`) VALUES ('"+ person.getSsn() +"','"+ person.getFname() +"','"+ person.getLname() +"','"+ person.getUsername() +"','"+ person.getPassword() +"','"+ person.getEmail() +"','"+ person.getSalary() +"','"+ person.getWorkhour()+"',2)";
        
        st.executeUpdate(sql);
        return true ;

    }
    
    
    public static boolean add_treatment(treatment treatment) throws ClassNotFoundException, SQLException {

        st = con.createStatement();
        String sql = "INSERT INTO `treatment`(`name`, `quantity`, `price`, `productdate`, `expiredate`) VALUES ('"+ treatment.getName() +"','"+ treatment.getQuantity() +"','"+ treatment.getPrice() +"','"+ treatment.getProductdate() +"','"+ treatment.getExpiredate() +"')";

        st.executeUpdate(sql);
        return true ;

    }

    public static ResultSet select_person() throws ClassNotFoundException, SQLException {
        st = con.createStatement();
        String sql = "select *  from   person WHERE `type`= 2 ";
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }

    
    public static ResultSet select_treatment() throws ClassNotFoundException, SQLException {
        st = con.createStatement();
        String sql = "select *  from   treatment ";
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }

    public static ResultSet select_one_treatment(int id) throws ClassNotFoundException, SQLException {
        st = con.createStatement();
        String sql = "select *  from   `treatment`  WHERE `id`=" + id + "  ";
        ResultSet rs = st.executeQuery(sql);
        
        return rs;
    }


    public ResultSet select_one_person(int id) throws ClassNotFoundException, SQLException {
        st = con.createStatement();
        String sql = ("SELECT * FROM `person` WHERE `id`="+id);
        ResultSet rs = st.executeQuery(sql);
 
        
        return rs;
    }

    public boolean delete_person(int id) throws ClassNotFoundException, SQLException {

        st = con.createStatement();
        String sql = ("DELETE FROM `person` WHERE `id`=" + id);
        int rs = st.executeUpdate(sql);
        return true;
    }

    public boolean delete_treatment(int id) throws ClassNotFoundException, SQLException {

        st = con.createStatement();
        String sql = "DELETE FROM `treatment` WHERE `id`=" + id + " ";
        int rs = st.executeUpdate(sql);
        return true;
    }

    public static boolean update_person(person person) throws ClassNotFoundException, SQLException {
       
        if (person.getPassword() != "") {
            st = con.createStatement();
            String sql = ("UPDATE `person` SET `ssn`='"+ person.getSsn() +"',`fname`='"+ person.getFname() +"',`lname`='"+ person.getLname() +"',`username`='"+ person.getUsername() +"',`password`='"+ person.getPassword() +"',`email`='"+ person.getEmail() +"',`salary`='"+ person.getSalary() +"',`workhour`='"+ person.getWorkhour() +"',`type`= 2 WHERE `id`='"+ person.getId() +"'");
            st.executeUpdate(sql);
            return true;
        } else {
            return false;
        }

    }

    public static boolean update_treatment(treatment treatment) throws ClassNotFoundException, SQLException {

        st = con.createStatement();
        String sql = ("UPDATE `treatment` SET `name`='"+ treatment.getName() +"',`quantity`='"+ treatment.getQuantity() +"',`price`='"+ treatment.getPrice() +"',`productdate`='"+ treatment.getProductdate() +"',`expiredate`='"+ treatment.getExpiredate() +"' WHERE `id`='"+ treatment.getId() +"'");

        st.executeUpdate(sql);
        
        return true;

    }


}
