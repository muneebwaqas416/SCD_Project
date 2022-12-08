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
public class deleteofficeboyTest {
    
    public deleteofficeboyTest() {
    }
       @org.junit.Test
    public void Testdelete2()
    {
        Mainpanel_Admin p1 = new Mainpanel_Admin();  
        boolean str = p1.Action3(2);
        assertEquals(true, str);
    } 
    @org.junit.Test
    public void Testdelete3()
    {
        Mainpanel_Admin p1 = new Mainpanel_Admin();  
        boolean str = p1.Action3(10);
        assertEquals(true, str);
    }
    
}
