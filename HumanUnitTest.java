

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test Class for the Human class.
 *
 * @author Michael Biondi
 * @version 2024-11
 */
public class HumanUnitTest
{
    /**
     * Default constructor for test class HumanUnitTest
     */
    public HumanUnitTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    /**
     * Tests instantiating a new Human, checking whether they are alive or knocked out, and attacking.
     */
    @Test
    public void testAttack() {
        Human john = new Human();
        
        assertEquals(true, john.isAlive());
        assertEquals(false, john.isKnockedOut());
        
        int attack = john.attack();
        assertEquals(true, attack > 0);
        
        john.takeDamage(1000);
        
        assertEquals(false, john.isAlive());
        assertEquals(true, john.isKnockedOut());
    }
}
