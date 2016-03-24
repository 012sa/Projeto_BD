/*
 * @autor: Jaqueline Ribeiro, Lorena Nascimento e Sarah Cabral
 * Controle Patrimonial
 */
package Implementations;
import model.bean.Usuario;

/**
 *
 * @author Jaqueline
 */
public interface UsuarioImpl {
    
    public void create(Usuario usu);

    public void delete(Usuario usu);

    public void update(Usuario usu, Usuario usu2);
    
}