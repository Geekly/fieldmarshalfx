/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import net.geeklythings.fm.jpa.TournamentJpaController;
import net.geeklythings.fm.managers.TournamentManager;
import net.geeklythings.fm.model.entity.Tournament;
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
public class TestTournamentManager {
    
    static Logger log = LogManager.getLogger(TestTournamentManager.class.getName());
    
    private EntityManagerFactory _emf;
    private TournamentJpaController tournamentJpaController;
    private TournamentManager manager;
    
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createTournaments()
    {
        Tournament t1 = Tournament.createTournament(3);
        System.out.println(t1.toString());
        Tournament t2 = Tournament.createTournament(2);
        Tournament t3 = Tournament.createTournament(4);
        manager.newTournament(t1);
        manager.newTournament(t2);
        manager.newTournament(t3); 
    }
    
    @Test
    public void hello() {
        assertNotNull(_emf);
        assertNotNull(tournamentJpaController);
        assertNotNull(manager);
        assertNull(manager.getAllTournaments());

        
        System.out.println("Added tournaments");
    }
}
