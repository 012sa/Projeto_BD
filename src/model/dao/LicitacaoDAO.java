/*
 * @autor: Jaqueline Ribeiro, Lorena Nascimento e Sarah Cabral
 * Controle Patrimonial
 */
package model.dao;



import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Licitacao;

/**
 *
 * @author Jaqueline, Lorena e Sarah
 */
public class LicitacaoDAO {
    
    public void create(Licitacao li){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            //onde ficará o insert
            stmt = con.prepareStatement("INSERT INTO licitacao_tb (objeto, fornecedor, preco) VALUES (?,?,?)");
            //get dos atrubutos
            stmt.setString(1,li.getObjeto());
            stmt.setString(2,li.getFornecedor());
            stmt.setDouble(3,li.getPreco());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Deletado com sucesso");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao deletar"+ex);
            
            Logger.getLogger(LicitacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        } 
    }
    
     public void delete(Licitacao li){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            //onde ficará o insert
            stmt = con.prepareStatement("DELETE FROM licitacao_tb WHERE codEdital = ? ");
            //get dos atrubutos
            stmt.setInt(1,li.getCodEdital());
           
            
            stmt.executeQuery();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao salvar"+ex);
            
            Logger.getLogger(LicitacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }   
    }
    

    public void update(Licitacao li, Licitacao li2) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE licitacao_tb SET Objeto = ?, fornecedor = ?, preco = ? WHERE codEdital= ?;");
            stmt.setString(1,li2.getObjeto());
            stmt.setString(2,li2.getFornecedor());
            stmt.setDouble(3,li2.getPreco());
            stmt.setInt(4,li.getCodEdital());

            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualização feita com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
    }
    
}
