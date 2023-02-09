
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
    public void Cadastrar(String nome,Integer salario, String sexo,String cpf,String cargo,String senha) {
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tst","root","123456");
            PreparedStatement statement = con.prepareStatement("insert into Gerente Values (?,?,?,?,?,?)");
            statement.setString(1, nome);
            statement.setInt(2, salario);
            statement.setString(3, sexo);
            statement.setString(4, cpf);
            statement.setString(5, cargo);
            statement.setString(6, senha);
            statement.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }    
       
     
    public void CloseCon(){
       try {
           con.close();
       } catch (SQLException ex) {
           Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
       }

    }
}

   

