
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conectar {
    Connection con ;
    public boolean OpenCon1(String user,String password,String cargo) throws ClassNotFoundException, SQLException {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tst","root","123456");
            PreparedStatement statement = con.prepareStatement("SELECT * FROM  " + "   " + cargo + "   " + "  WHERE nome=? AND senha=?");
            statement.setString(1, user);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            return resultSet.next();
            
            }finally{}
            
            
    }
    public boolean OpenCon2(String user,String password) throws ClassNotFoundException, SQLException {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tst","root","123456");
            PreparedStatement statement = con.prepareStatement("SELECT * FROM Caixa WHERE nome=? AND senha=?");
            statement.setString(1, user);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            return resultSet.next();
            
        }finally{}
        }
     
    public void CloseCon(){
       try {
           con.close();
       } catch (SQLException ex) {
           Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
       }

    }
}

   

