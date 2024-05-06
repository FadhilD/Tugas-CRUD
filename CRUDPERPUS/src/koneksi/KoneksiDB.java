/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.*;
/**
 *
 * @author asus
 */
public class KoneksiDB {
     Connection conn;
    public static Connection BukaKoneksi(){
    String DBurl = "jdbc:mysql://localhost:3306/perpus_db";
    String DBusername = "root";
    String DBpassword = "";
    
    
//    Statement statement;
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DBurl,DBusername, DBpassword);
          System.out.println("Connection Succes");
          return conn;
         }catch(Exception ex){
              System.out.println("Connection Failed " + ex.getMessage());
         } 
        return null;
}
}
