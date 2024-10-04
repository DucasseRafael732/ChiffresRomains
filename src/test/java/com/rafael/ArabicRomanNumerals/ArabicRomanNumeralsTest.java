package com.rafael.ArabicRomanNumerals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArabicRomanNumeralsTest {

    @Test
    void devrait_convertir_1_en_I() {
        ArabicRomanNumerals conversion = new ArabicRomanNumerals();
        // GIVEN
        int nbreArabe = 1;
        // WHEN
        String resultat = conversion.convert(nbreArabe);
        // THEN
        assertEquals("I", resultat);
    }
}