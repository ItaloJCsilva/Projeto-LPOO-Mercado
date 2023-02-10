/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produtos;

import Conexao.Conectar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Prod {
    Connection con= null ;
    public Prod() {
    }

    
    
    public void cadastrar(String id,String nome , String qtd, String preco){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tst","root","123456");
            PreparedStatement statement = con.prepareStatement("insert into produtos Values (?,?,?,?)");
            statement.setInt(1, Integer.valueOf(id));
            statement.setString(2, nome);
            statement.setInt(3, Integer.valueOf(qtd));
            statement.setInt(4, Integer.valueOf(preco));
            statement.executeUpdate();
            new Conectar().CloseCon();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Prod.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Prod.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    
    
    }
    
    
    
}
