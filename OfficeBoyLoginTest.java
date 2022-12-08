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
 
public class OfficeBoyLoginTest 
{
    public OfficeBoyLoginTest() 
    {
    }
       @org.junit.Test
    public void Test_Admin()
    {
       OfficeBoyLogin a1 = new OfficeBoyLogin();
       boolean str = a1.Action("ahmad","12345");
              assertEquals(true, str);

    }
     @org.junit.Test
    public void Test_Admin2()
    {
        AdminLogin a1 = new AdminLogin();  
       boolean str = a1.Action("ahma_d","543221");
        assertEquals(true, str);
    }
}
