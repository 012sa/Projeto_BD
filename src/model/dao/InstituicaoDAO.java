/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;


import Interface.instituicao_int;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Instituicao;

/**
 *
 * @author Jaqueline
 */
public class InstituicaoDAO implements instituicao_int {
    
    public void create(Instituicao ifpb){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            //onde ficará o insert
            stmt = con.prepareStatement("INSERT INTO instituicao_tb (estado, campus) VALUES (?,?)");
            //get dos atrubutos
            stmt.setString(1,ifpb.getCampus());
            stmt.setString(2,ifpb.getEstado());
            
            stmt.executeQuery();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao salvar"+ex);
            
            Logger.getLogger(InstituicaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    public void delete(Instituicao ifpb){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            //onde ficará o insert
            stmt = con.prepareStatement("DELETE FROM instituicao_tb WHERE campus = ? ");
            //get dos atrubutos
            stmt.setString(1,ifpb.getCampus());
           
            
            stmt.executeQuery();
            
            JOptionPane.showMessageDialog(null, "Deletado com sucesso");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao deletar"+ex);
            
            Logger.getLogger(InstituicaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }   
    }
    
    public void update(Instituicao inst1, Instituicao inst2) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE Instituicao_tb SET campus = ?, estado = ? WHERE idCampus = ?");
            stmt.setString(1,inst2.getCampus());
            stmt.setString(2,inst2.getEstado());
            stmt.setInt(3,inst1.getIdCampus());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualização feita com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
    }
    
    
    
}
