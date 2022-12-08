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
public class Edit_Student_RecordTest {
    
    @Test
    public void test_search_v1()
    {
        Edit_Student_Record r1 = new Edit_Student_Record();
        r1.setVisible(true);
        r1.set_search("1");
        String Program = r1.Action();
        assertTrue("BSSE".equals(Program));
        
    }
    
    @Test
    public void test_search_v2()
    {
        Edit_Student_Record r1 = new Edit_Student_Record();
        r1.setVisible(true);
        r1.set_search("");
        String Program = r1.Action();
        assertTrue("Please enter valid BForm Number".equals(Program));
        
    }
    
    @Test
    public void test_search_v3()
    {
        Edit_Student_Record r1 = new Edit_Student_Record();
        r1.setVisible(true);
        r1.set_search(" ");
        String Program = r1.Action();
        assertTrue("Please enter valid BForm Number".equals(Program));
        
    }
    
    @Test
    public void test_edit_v1()
    {
        Edit_Student_Record r1 = new Edit_Student_Record();
        r1.setVisible(true);
        r1.set_search("1");
        r1.set_text_Program("BSDS");
        String Program = r1.edit_test();
        System.out.println(Program);
        assertTrue("BSDS".equals(Program));
        
    }
    
}
