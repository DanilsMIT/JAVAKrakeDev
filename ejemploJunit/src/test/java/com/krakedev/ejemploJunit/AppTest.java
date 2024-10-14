package com.krakedev.ejemploJunit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    
    @Test
    public void testSumar() {
    	Calculadora c=new Calculadora();
    	int result=c.sumar(2, 3);
    	assertTrue(result==5);
    }
    
    @Test
    public void testRestar() {
    	Calculadora c=new Calculadora();
    	int result=c.restar(7, 4);
    	assertTrue(result==3);
    }
}
