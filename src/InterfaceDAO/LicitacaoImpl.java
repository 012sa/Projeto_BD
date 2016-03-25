/*
 * @autor: Jaqueline Ribeiro, Lorena Nascimento e Sarah Cabral
 * Controle Patrimonial
 */
package InterfaceDAO;

import model.bean.Licitacao;

/**
 *
 * @author Jaqueline
 */
public interface LicitacaoImpl {
    
    public void create(Licitacao li);
     
     public void delete(Licitacao li); 
     
     public void update(Licitacao li, Licitacao li2);
}


