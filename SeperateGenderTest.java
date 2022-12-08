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
public class SeperateGenderTest {
    
    public SeperateGenderTest() {
    }
     @org.junit.Test
    public void Test_Admin2()
    {
        MainPanel p1 = new MainPanel();  
        boolean str = p1.Action6();
        assertEquals(true, str);
    }
}
