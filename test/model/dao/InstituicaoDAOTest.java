/*
 * @autor: Jaqueline Ribeiro, Lorena Nascimento e Sarah Cabral
 * Controle Patrimonial
 */
package model.dao;

import model.bean.Instituicao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jaqueline
 */
public class InstituicaoDAOTest {
    
    public InstituicaoDAOTest() {
    }
    
    /**
     * Test of create method, of class InstituicaoDAO.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Instituicao ifpb =  new Instituicao("PB", "Campina Grande");
        InstituicaoDAO instance = new InstituicaoDAO();
        assertEquals("Campina Grande",ifpb.getCampus() );
        instance.create(ifpb);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class InstituicaoDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Instituicao ifpb = null;
        InstituicaoDAO instance = new InstituicaoDAO();
        instance.delete(ifpb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
