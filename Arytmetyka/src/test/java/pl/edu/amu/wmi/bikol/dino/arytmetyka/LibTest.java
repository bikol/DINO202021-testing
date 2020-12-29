package pl.edu.amu.wmi.bikol.dino.arytmetyka;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
    
    @Test
    public void testMul2() {
        String a = "1";
        String b = "1";
        Lib instance = new Lib();
        String expResult = "1";
        String result = instance.mul(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAdd2(){
        String a = "Inżynieria";
        String b = "oprogramowania";
        Lib instance = new Lib();
        String expResult = "Inżynieria oprogramowania";
        String result = instance.add(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAdd3(){
        String a = "B";
        String b = "A";
        Lib instance = new Lib();
        String expResult = "XYZ";
        String result = instance.add(a, b);
        assertEquals(expResult, result);
    }
    
}
