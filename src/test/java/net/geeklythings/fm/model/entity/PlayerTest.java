/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.geeklythings.fm.model.entity;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import net.geeklythings.fm.jpa.TournamentJpaController;
import net.geeklythings.fm.managers.TournamentManager;
import net.geeklythings.fm.model.PlayerStatus;
import net.geeklythings.fm.type.Faction;
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
public class PlayerTest {
    static Logger log = LogManager.getLogger(PlayerTest.class.getName());
    private EntityManagerFactory _emf;
    private TournamentJpaController tournamentJpaController;
    private TournamentManager manager;
    
    public PlayerTest() {
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
        
        tournamentJpaController = new TournamentJpaController(_emf);
        log.debug("Creating TournamentManager");
        manager = new TournamentManager( tournamentJpaController ); 

    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void addPlayer()
    {
        Player player = new Player();
        EntityManager em = _emf.createEntityManager();
        em.persist(player);
        Player newPlayer = em.find(Player.class, player.getId());
        assertEquals( player, newPlayer);
        
    }
    
    @Test
    public void removePlayer()
    {
        Player player = new Player();
        player.setFirstName("Tom");
        EntityManager em = _emf.createEntityManager();
        em.persist(player);
        Player newPlayer = em.find(Player.class, player.getId());
        assertEquals( "Player exisits", player, newPlayer);
        
        em.remove(player);
        assertTrue( "Player removed", player.equals(newPlayer));
    }
    /**
     * Test of toString method, of class Player.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Player instance = new Player();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResults method, of class Player.
     */
    @Test
    public void testGetResults() {
        System.out.println("getResults");
        Player instance = new Player();
        List<PlayerResult> expResult = null;
        List<PlayerResult> result = instance.getResults();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResults method, of class Player.
     */
    @Test
    public void testSetResults() {
        System.out.println("setResults");
        List<PlayerResult> results = null;
        Player instance = new Player();
        instance.setResults(results);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastRoundPlayed method, of class Player.
     */
    @Test
    public void testGetLastRoundPlayed() {
        System.out.println("getLastRoundPlayed");
        Player instance = new Player();
        int expResult = 0;
        int result = instance.getLastRoundPlayed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastRoundPlayed method, of class Player.
     */
    @Test
    public void testSetLastRoundPlayed() {
        System.out.println("setLastRoundPlayed");
        int lastRoundPlayed = 0;
        Player instance = new Player();
        instance.setLastRoundPlayed(lastRoundPlayed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Player.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Player instance = new Player();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Player.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Player instance = new Player();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWins method, of class Player.
     */
    @Test
    public void testGetWins() {
        System.out.println("getWins");
        Player instance = new Player();
        int expResult = 0;
        int result = instance.getWins();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLosses method, of class Player.
     */
    @Test
    public void testGetLosses() {
        System.out.println("getLosses");
        Player instance = new Player();
        int expResult = 0;
        int result = instance.getLosses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStandings method, of class Player.
     */
    @Test
    public void testGetStandings() {
        System.out.println("getStandings");
        Player instance = new Player();
        int expResult = 0;
        int result = instance.getStandings();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFaction method, of class Player.
     */
    @Test
    public void testGetFaction() {
        System.out.println("getFaction");
        Player instance = new Player();
        Faction expResult = null;
        Faction result = instance.getFaction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFaction method, of class Player.
     */
    @Test
    public void testSetFaction() {
        System.out.println("setFaction");
        Faction faction = null;
        Player instance = new Player();
        instance.setFaction(faction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActiveStatus method, of class Player.
     */
    @Test
    public void testGetActiveStatus() {
        System.out.println("getActiveStatus");
        Player instance = new Player();
        PlayerStatus expResult = null;
        PlayerStatus result = instance.getActiveStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActiveStatus method, of class Player.
     */
    @Test
    public void testSetActiveStatus() {
        System.out.println("setActiveStatus");
        PlayerStatus activeStatus = null;
        Player instance = new Player();
        instance.setActiveStatus(activeStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class Player.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Player instance = new Player();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class Player.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        Player instance = new Player();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Player.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Player instance = new Player();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Player.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Player instance = new Player();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHomeTown method, of class Player.
     */
    @Test
    public void testGetHomeTown() {
        System.out.println("getHomeTown");
        Player instance = new Player();
        String expResult = "";
        String result = instance.getHomeTown();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHomeTown method, of class Player.
     */
    @Test
    public void testSetHomeTown() {
        System.out.println("setHomeTown");
        String homeTown = "";
        Player instance = new Player();
        instance.setHomeTown(homeTown);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Player.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Player instance = new Player();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Player.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Player instance = new Player();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Player.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Player instance = new Player();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Player.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Player instance = new Player();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
