package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest 
{
    @Test
    public void testMultiply() 
    {
        App obj = new App();
        assertEquals(6, obj.multiply(2, 3));
    }
}