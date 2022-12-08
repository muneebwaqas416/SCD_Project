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


public class addstdTest {
    
    public addstdTest() {
    }
      @org.junit.Test
    public void Test_addstd()
    {
        MainPanel p1 = new MainPanel();  
        boolean str = p1.Action7("Ali","hassan","24-2-1999","35202-9686322-0","Male","03123444789","35202-96863413-1","03246652220","FSc",20000,7000,554136,"20-11-2012",890,"Sabir","Media","ajmal","Mature");
        assertEquals(true, str);
    }
    @org.junit.Test
    public void Test_addstd2()
    {
        MainPanel p1 = new MainPanel();  
        boolean str = p1.Action7("Ali","hassan","24-2-1999","35202-9686322-0","Male","03123444789","35202-96863413-1","03246652220","FSc",20000,7000,554136,"20-11-2012",890,"Sabir","Media","ajmal","Mature");
        assertEquals(true, str);
    }
    
}
