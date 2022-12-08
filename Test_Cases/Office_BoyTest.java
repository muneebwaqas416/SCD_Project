/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package scd_project;

import org.junit.Test;
import static org.junit.Assert.*;
import scd_project.*;

/**
 *
 * @author PC
 */
public class Office_BoyTest {
    
    @Test
    public void testOffice_BoyTest()
    {
        Office_Boy o1 = new Office_Boy();
        o1.setVisible(true);
        o1.settext("", "", "");
        String str = o1.Action();
        assertTrue("Please Enter valid Credentials".equals(str));
        
        
    }
    
    @Test
    public void testOffice_BoyTest_v1()
    {
        Office_Boy o1 = new Office_Boy();
        o1.setVisible(true);
        o1.settext("Muneeb Waqas", "20L-1372", "!@#123456!@#");
        String str = o1.Action();
        assertTrue("Please Enter valid Credentials".equals(str));
        
        
    }
    
}
