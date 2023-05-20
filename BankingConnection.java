/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingapplication2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JJ_JoJo
 */
public class BankingConnection {
        public static Connection connect(){
            
        String url = "jdbc:mysql://localhost:3306/mydb2";
        String username = "root";
        String password ="Jayda_9252"; 
        Connection con = null;
        
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                 con= DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(BankingConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return con;
         
        }
}
