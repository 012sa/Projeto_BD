/*
 * @autor: Jaqueline Ribeiro, Lorena Nascimento e Sarah Cabral
 * Controle Patrimonial
 */
package InterfaceDAO;
import model.bean.Concorrente;

/**
 *
 * @author Jaqueline
 */
public interface ConcorrenteImpl {
    
    public void create(Concorrente c);

    public void delete(Concorrente c);

    public void update(Concorrente c, Concorrente c2);
    
}
