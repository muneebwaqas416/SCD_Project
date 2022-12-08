/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package scdproject_2;
 
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class searchTest {
    
    public searchTest()
    {
    
    }
    @org.junit.Test
    public void Testsearch()
    {
        MainPanel p1 = new MainPanel();  
        boolean str = p1.Action2("Muneeb");
        assertEquals(true, str);
    }
   @org.junit.Test
    public void Testsearch2()
    {
        MainPanel p1 = new MainPanel();  
        boolean str = p1.Action2("waqas");
        assertEquals(true, str);
    }
    
}