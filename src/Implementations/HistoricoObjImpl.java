/*
 * @autor: Jaqueline Ribeiro, Lorena Nascimento e Sarah Cabral
 * Controle Patrimonial
 */
package Implementations;

import model.bean.HistoricoObj;

/**
 *
 * @author Jaqueline
 */
public interface HistoricoObjImpl {
    
    public void create(HistoricoObj his);
     
     public void delete(HistoricoObj his); 
     
     public void update(HistoricoObj his, HistoricoObj his2);
}
