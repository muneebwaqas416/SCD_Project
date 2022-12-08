/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package scd_project;

import org.junit.Test;
import static org.junit.Assert.*;
import scd_project.*;
import Internal.*;

/**
 *
 * @author PC
 */
public class Office_Boy_mainTest {
    
    @Test
    public void Test_v1()
    {
        Office_Boy_main o1 = new Office_Boy_main();
        o1.setVisible(true);
        o1.Set_txt("Muneeb");
        o1.Set_txt_1("aqndjk");
        String str = o1.Action();
        assertTrue("Officeboy Account deleted successfully".equals(str));
        
    }
    @Test
    public void Test_v2()
    {
        Office_Boy_main o1 = new Office_Boy_main();
        o1.setVisible(true);
        o1.Set_txt("");
        o1.Set_txt_1("");
        String str = o1.Action();
        assertTrue("Officeboy Account deleted successfully".equals(str));
        
    }
    
    
    
}
