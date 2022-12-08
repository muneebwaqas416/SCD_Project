package scdproject_2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class accCreationTest {
    
    public accCreationTest() 
    {}
      @org.junit.Test
    public void Test_Admin2()
    {
        Mainpanel_Admin p1 = new Mainpanel_Admin();  
        boolean str = p1.Action("Ali Ahmad","12345");
        assertEquals(true, str);
    }
    
}