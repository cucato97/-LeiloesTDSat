/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */

import java.sql.PreparedStatement;
import java.sql.Connection;
<<<<<<< HEAD
import java.sql.SQLException;
=======
>>>>>>> c718997142311c5294ed30ab2f6c62decce5f52a
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ProdutosDAO {
    
    Connection conn;
    PreparedStatement prep;
    ResultSet resultset;
    ArrayList<ProdutosDTO> listagem = new ArrayList<>();
    
    public void cadastrarProduto (ProdutosDTO produto){
        
<<<<<<< HEAD
  String sql = "INSERT INTO produtos (nome, valor, status) VALUES (?, ?, ?)";

        try {
            conn = new conectaDAO().connectDB();
            prep = conn.prepareStatement(sql);

            prep.setString(1, produto.getNome());
            prep.setDouble(2, produto.getValor());
            prep.setString(3, produto.getStatus());

            prep.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto cadastrado, Sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + erro.getMessage());
        } finally {
            try {
                if (prep != null) prep.close();
                if (conn != null) conn.close();
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + erro.getMessage());
            }
        }
    }

=======
        
        //conn = new conectaDAO().connectDB();
        
        
    }
>>>>>>> c718997142311c5294ed30ab2f6c62decce5f52a
    
    public ArrayList<ProdutosDTO> listarProdutos(){
        
        return listagem;
    }
    
    
    
        
}

