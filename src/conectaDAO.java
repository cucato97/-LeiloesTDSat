
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

<<<<<<< HEAD
=======


>>>>>>> c718997142311c5294ed30ab2f6c62decce5f52a
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
<<<<<<< HEAD
=======

>>>>>>> c718997142311c5294ed30ab2f6c62decce5f52a
/**
 *
 * @author Adm
 */
public class conectaDAO {
<<<<<<< HEAD

    public Connection connectDB() {
        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/uc11"; 
            String user = "root"; 
            String password = "root"; 

            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException erro) {
            System.out.println("Erro ao conectar: " + erro.getMessage());
        }

        return conn;
    }
=======
    
    public Connection connectDB(){
        Connection conn = null;
        
        try {
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/uc11?user=root&password=");
            
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ConectaDAO" + erro.getMessage());
        }
        return conn;
    }
    
>>>>>>> c718997142311c5294ed30ab2f6c62decce5f52a
}
