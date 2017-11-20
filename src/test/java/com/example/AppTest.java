package com.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test example for Calculator 
 */
public class AppTest 
    extends TestCase
{
    /**
     * Constructor to create the test case
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
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
	 
	 private int x = 1;
	 private int y = 1;
  
  public void testAddition() {
    int z = x + y;
    assertEquals(2, z);
  }
  public void testSubtraction() 
  {
    int z = x - y;
    assertEquals(0, z);
  }
  
  public void testMultiplicaation() {
    int z = x * y;
    assertEquals(5, z);
  }
  
  public void testDivision() {
    int z = x / y;
    assertEquals(1, z);
  }
  
}
