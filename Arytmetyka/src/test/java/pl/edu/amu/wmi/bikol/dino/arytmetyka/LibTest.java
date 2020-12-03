/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.bikol.dino.arytmetyka;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bikol
 */
public class LibTest {
    
    public LibTest() {
    }

    @Test
    public void testAdd1() {
        String a = "1";
        String b = "1";
        Lib instance = new Lib();
        String expResult = "2";
        String result = instance.add(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMul1() {
        String a = "1";
        String b = "2";
        Lib instance = new Lib();
        String expResult = "2";
        String result = instance.mul(a, b);
        assertEquals(expResult, result);
    }
    
}
