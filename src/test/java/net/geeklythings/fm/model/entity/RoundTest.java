/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.geeklythings.fm.model.entity;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import net.geeklythings.fm.jpa.TournamentJpaController;
import net.geeklythings.fm.managers.TournamentManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author ENG-5 USER
 */
public class RoundTest {
    static Logger log = LogManager.getLogger(PlayerTest.class.getName());
    private EntityManagerFactory _emf;
    private TournamentJpaController tournamentJpaController;
    private TournamentManager manager;
    
    @PersistenceContext
    EntityManager em;
    
    public RoundTest() {
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

    @Test
    public void addRounds()
    {
        Round r1 = new Round(2);
        em.persist(r1);
        Round findRound = em.find(Round.class, r1.getId());
        assertEquals( "Round persisted and retrieved", r1, findRound );
    }
    
    /**
     * Test of toString method, of class Round.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Round instance = new Round();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Round.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Round instance = new Round();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Round.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Round instance = new Round();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoundResults method, of class Round.
     */
    @Test
    public void testGetRoundResults() {
        System.out.println("getRoundResults");
        Round instance = new Round();
        List<MatchResult> expResult = null;
        List<MatchResult> result = instance.getRoundResults();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoundNumber method, of class Round.
     */
    @Test
    public void testGetRoundNumber() {
        System.out.println("getRoundNumber");
        Round instance = new Round();
        int expResult = 0;
        int result = instance.getRoundNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoundNumber method, of class Round.
     */
    @Test
    public void testSetRoundNumber() {
        System.out.println("setRoundNumber");
        int roundNumber = 0;
        Round instance = new Round();
        instance.setRoundNumber(roundNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPairings method, of class Round.
     */
    @Test
    public void testGetPairings() {
        System.out.println("getPairings");
        Round instance = new Round();
        List<MatchPairing> expResult = null;
        List<MatchPairing> result = instance.getPairings();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPairings method, of class Round.
     */
    @Test
    public void testSetPairings() {
        System.out.println("setPairings");
        List<MatchPairing> pairings = null;
        Round instance = new Round();
        instance.setPairings(pairings);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPairing method, of class Round.
     */
    @Test
    public void testAddPairing() {
        System.out.println("addPairing");
        MatchPairing pairing = null;
        Round instance = new Round();
        instance.addPairing(pairing);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
