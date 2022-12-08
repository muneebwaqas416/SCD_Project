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
public class AdminTest {
    
    @Test
    public void Test_Admin()
    {
        Admin a1 = new Admin();
        a1.setVisible(true);
        a1.set_1("Adin");
        a1.set_2("123");
        String str = a1.Action();
        assertTrue("Invalid Credentials".equals(str));
    }
    
    @Test
    public void Test_Admin_v2(){
        Admin a1 = new Admin();
        a1.setVisible(true);
        a1.set_1("Muneeb123");
        a1.set_2("123");
        String str = a1.Action();
        assertTrue("Login attempt Successfull".equals(str));
    }
}
