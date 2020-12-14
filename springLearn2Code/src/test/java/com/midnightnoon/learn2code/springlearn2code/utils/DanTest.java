package com.midnightnoon.learn2code.springlearn2code.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DanTest {

    @Test
    public void suma100PlusDanJe120(){
        assertEquals(BigDecimal.valueOf(120L),
                Dan.pripocitajDan(BigDecimal.valueOf(100L)));
    }

    @Test
    public void suma141PlusDanJe169Cela2(){
        assertEquals(BigDecimal.valueOf(169.20).setScale(2),
                Dan.pripocitajDan(BigDecimal.valueOf(141L).setScale(2)));
    }

    @Test
    public void suma10NieJe1000(){
        assertNotEquals(BigDecimal.valueOf(1000L).setScale(2),
                Dan.pripocitajDan(BigDecimal.valueOf(10L).setScale(2)));
    }

}