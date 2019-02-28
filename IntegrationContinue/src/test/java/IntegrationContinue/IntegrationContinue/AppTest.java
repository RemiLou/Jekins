package IntegrationContinue.IntegrationContinue;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	Calculs ca = null;
	Calculs ca2 = null;
	Calculs ca3 = null;
	Calculs ca4 = null;
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */


    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void setUp(){
    	ca = new Calculs(2,2);
     	ca2 = new Calculs(1,1);
    	ca3 = new Calculs(2,2);
    	ca4 = new Calculs(10,8);
    }
    
	public void testMultiplier(){
		int result = ca.multiplier();
		assertEquals("MultiplierKO", 4, result);
	}
	
	public void testAdditionner(){
		int result = ca2.additionner();
		assertEquals("AdditionnerKO", 2, result);
	}
	
	public void testDiviser(){
		int result = ca3.diviser();
		assertEquals("DiviserKO", 1, result);
	}
	
	public void testSoustraire(){
		int result = ca4.soustraire();
		assertEquals("SoustraireKO", 2, result);
	}
	
	public void testDiviserErreur(){
		Calculs ca = new Calculs(2,0);
		int result = ca.diviser(); 
		assertEquals(0, result);
	}
}
