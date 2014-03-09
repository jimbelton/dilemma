package com.github.jimbelton.dilemma;

import junit.framework.TestCase;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        App myApp = new App();
        assertEquals(0, myApp.method(0));
    }
}
