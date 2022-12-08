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

/**
 *
 * @author Hassan
 */
public class viewLeftedTest {
    
    public viewLeftedTest() {
    }
    
     @org.junit.Test
    public void Test_viewlefted()
    {
        MainPanel p1 = new MainPanel();  
        boolean str = p1.Action4();
        assertEquals(true, str);
    }
}
