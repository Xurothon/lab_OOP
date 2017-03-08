/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.kazachonak;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author student
 */
public class CalcTest {
    
    public CalcTest() {
    }

    @Test
    public void testSum() {
        int a = 10;
        int b = 5;
        int c = 15;
        
       assertEquals(c, Calc.sum(a,b));
        
    }

    @Test
    public void testSub() {
        int a = 10;
        int b = 5;
        int c = 5;
        
       assertEquals(c, Calc.sub(a,b));
    }

    @Test
    public void testMul() {
        int a = 10;
        int b = 5;
        int c = 50;
        
       assertEquals(c, Calc.mul(a,b));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivOfZero() {
        int a = 10;
        int b = 0;
        int c = 2;
        
       assertEquals(c, Calc.div(a,b));
    }
    
    @Test
    public void testDiv() {
        int a = 10;
        int b = 5;
        int c = 2;
        
       assertEquals(c, Calc.div(a,b));
    }
    
}
