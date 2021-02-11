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
        String a = "I";
        String b = "III";
        Lib instance = new Lib();
        String expResult = "IV";
        String result = instance.add(a, b);
        assertEquals(expResult, result);
    }
  
    @Test
    public void testAdd13(){
        String a = "one";
        String b = "two";
        Lib instance = new Lib();
        String expResult = "3";
        String result = instance.add(a,b);
    }
        
    @Test
    public void testMul3(){
        String a = "abc";
        String b = "2";
        Lib instance = new Lib();
        String expResult = "abcabc";
        String result = instance.mul(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMul4(){
        String a = "ab";
        String b = "3";
        Lib instance = new Lib();
        String expResult = "ababab";
        String result = instance.mul(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPow(){
        String a = "2";
        String b = "^3";
        Lib instance = new Lib();
        String expResult = "8";
        String result = instance.mul(a, b);
        assertEquals(expResult, result);
    }
  
    @Test
    public void testAdd10(){
        String a = "A";
        String b = "B";
        Lib instance = new Lib();
        String expResult = "C";
        String result = instance.add(a, b);
        assertEquals(expResult, result);
    }
    

    @Test
    public void testAdd11(){

        String a = "c";
        String b = "1";
        Lib instance = new Lib();
        String expResult = "d";
        String result = instance.add(a, b);
        assertEquals(expResult, result);

    }
    

    @Test
    public void testAdd4(){
        String a = "B";
        String b = "A";
        Lib instance = new Lib();
        String expResult = "XYZ";
        String result = instance.add(a, b);
        assertEquals(expResult, result);
    }

       public void testAdd5(){
        String a = "X";
        String b = "D";
        Lib instance = new Lib();
        String expResult = "XD";
        String result = instance.add(a, b);
        assertEquals(expResult, result);
    }

}




