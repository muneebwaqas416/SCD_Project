/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package scdproject_2;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.runners.Parameterized;
import java.io.*;
import java.lang.Thread;

public class AdminLoginTest {
    
  
    
      @org.junit.Test
    public void Test_Admin()
    {
        AdminLogin a1 = new AdminLogin();
        //a1.setVisible(true);
     //   a1.set_1("Adin");
     //   a1.set_2("123");
       boolean str = a1.Action("Admin1","admin");
              assertEquals(true, str);

    }
     @org.junit.Test
    public void Test_Admin2()
    {
        AdminLogin a1 = new AdminLogin();
        //a1.setVisible(true);
     //   a1.set_1("Adin");
     //   a1.set_2("123");
       boolean str = a1.Action("Adm","admin");
              assertEquals(true, str);

    }
}
