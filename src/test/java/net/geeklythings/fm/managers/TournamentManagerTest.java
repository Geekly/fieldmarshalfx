/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.geeklythings.fm.managers;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManagerFactory;
import net.geeklythings.fm.jpa.TournamentJpaController;
import net.geeklythings.fm.model.entity.PlayerTest;
import net.geeklythings.fm.model.entity.Tournament;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author ENG-5 USER
 */
public class TournamentManagerTest {
    static Logger log = LogManager.getLogger(PlayerTest.class.getName());
    private EntityManagerFactory _emf;
    private TournamentJpaController jpaController;
    private TournamentManager manager;
    public TournamentManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        _emf = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("net.geeklythings.FieldMarshalMySqlPU");
        
        jpaController = new TournamentJpaController(_emf);
        log.debug("Creating TournamentManager");
        manager = new TournamentManager( jpaController );
        Tournament t = Tournament.createTournament(3);
        manager.setTournament(t);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTournament method, of class TournamentManager.
     */
    @Test
    public void testGetActiveTournament() {
        System.out.println("getTournament");
        TournamentManager instance = manager;
        Tournament expResult = new Tournament();
        manager.setTournament( expResult );
        Tournament result = instance.getActiveTournament();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getAllTournaments method, of class TournamentManager.
     */
    @Ignore @Test
    public void testGetAllTournaments() {
        System.out.println("getAllTournaments");
        TournamentManager instance = null;
        List<Tournament> expResult = null;
        List<Tournament> result = instance.getAllTournaments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTournament method, of class TournamentManager.
     */
    @Ignore @Test
    public void testSetTournament() {
        System.out.println("setTournament");
        Tournament t = null;
        TournamentManager instance = null;
        instance.setTournament(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateTournament method, of class TournamentManager.
     */
    @Ignore @Test
    public void testUpdateTournament() {
        System.out.println("updateTournament");
        Tournament t = null;
        TournamentManager instance = null;
        instance.updateTournament(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadTournament method, of class TournamentManager.
     */
    @Ignore @Test
    public void testLoadTournament() {
        System.out.println("loadTournament");
        long tournamentId = 0L;
        TournamentManager instance = null;
        Tournament expResult = null;
        Tournament result = instance.loadTournament(tournamentId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of propertyChange method, of class TournamentManager.
     */
    @Ignore @Test
    public void testPropertyChange() {
        System.out.println("propertyChange");
        PropertyChangeEvent pce = null;
        TournamentManager instance = null;
        instance.propertyChange(pce);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPropertyChangeListener method, of class TournamentManager.
     */
    @Ignore @Test
    public void testAddPropertyChangeListener() {
        System.out.println("addPropertyChangeListener");
        PropertyChangeListener listener = null;
        TournamentManager instance = null;
        instance.addPropertyChangeListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removePropertyChangeListener method, of class TournamentManager.
     */
    @Ignore @Test
    public void testRemovePropertyChangeListener() {
        System.out.println("removePropertyChangeListener");
        PropertyChangeListener listener = null;
        TournamentManager instance = null;
        instance.removePropertyChangeListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of newTournament method, of class TournamentManager.
     */
    @Test (expected=EntityExistsException.class)
    public void testNewTournament() {
        System.out.println("newTournament");
        Tournament t = new Tournament();
        jpaController.create(t);
        
        TournamentManager instance = manager;
        instance.newTournament(t);
        // TODO review the generated test code and remove the default call to fail.
        instance.newTournament(t);
    }
    
}
