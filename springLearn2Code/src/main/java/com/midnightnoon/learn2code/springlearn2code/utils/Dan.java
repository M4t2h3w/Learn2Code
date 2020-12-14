package com.midnightnoon.learn2code.springlearn2code.utils;

import java.math.BigDecimal;

public class Dan {

    private static final int aktualnaDan = 20;

    public static BigDecimal pripocitajDan(BigDecimal suma){

        return suma.add(
                suma.divide(BigDecimal.valueOf(100))
                        .multiply(BigDecimal.valueOf(aktualnaDan)));
    }
}
