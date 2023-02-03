
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conectar {
   public boolean OpenCon(String user,String password) throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tst","root","123456");
            PreparedStatement statement = con.prepareStatement("SELECT * FROM Pessoas WHERE Nome=? AND senha=?");
            statement.setString(1, user);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            return resultSet.next();
            
            }finally{System.err.println("Funcionou");
        }
            
            
    }}



   

