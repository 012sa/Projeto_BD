/*
 * @autor: Jaqueline Ribeiro, Lorena Nascimento e Sarah Cabral
 * Controle Patrimonial
 */
package InterfaceDAO;

import model.bean.Objeto;

/**
 *
 * @author Jaqueline
 */
public interface ObjetoImpl {
    
    public void create(Objeto obj);
     
     public void delete(Objeto obj); 
     
     public void update(Objeto obj, Objeto obj2);
}


