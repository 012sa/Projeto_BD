/*
 * @autor: Jaqueline Ribeiro, Lorena Nascimento e Sarah Cabral
 * Controle Patrimonial
 */
package Implementations;

import model.bean.Patrimonio;

/**
 *
 * @author Jaqueline
 */
public interface PatrimonioImpl {
    
    public void create(Patrimonio p);
     
     public void delete(Patrimonio p); 
     
     public void update(Patrimonio p, Patrimonio p2);
}

