/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.geeklythings.fm.managers;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;
import net.geeklythings.fm.model.entity.Tournament;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ENG-5 USER
 */
public class TournamentManagerTest {
    
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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTournament method, of class TournamentManager.
     */
    @Test
    public void testGetTournament() {
        System.out.println("getTournament");
        TournamentManager instance = null;
        Tournament expResult = null;
        Tournament result = instance.getTournament();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllTournaments method, of class TournamentManager.
     */
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
    public void testRemovePropertyChangeListener() {
        System.out.println("removePropertyChangeListener");
        PropertyChangeListener listener = null;
        TournamentManager instance = null;
        instance.removePropertyChangeListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
