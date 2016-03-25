/*
 * @autor: Jaqueline Ribeiro, Lorena Nascimento e Sarah Cabral
 * Controle Patrimonial
 */
package model.dao;

import model.bean.Concorrente;
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
public class ConcorrenteDAOTest {
    
    public ConcorrenteDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class ConcorrenteDAO.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Concorrente c = null;
        ConcorrenteDAO instance = new ConcorrenteDAO();
        instance.create(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ConcorrenteDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Concorrente c = null;
        ConcorrenteDAO instance = new ConcorrenteDAO();
        instance.delete(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ConcorrenteDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Concorrente c = null;
        Concorrente c2 = null;
        ConcorrenteDAO instance = new ConcorrenteDAO();
        instance.update(c, c2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
