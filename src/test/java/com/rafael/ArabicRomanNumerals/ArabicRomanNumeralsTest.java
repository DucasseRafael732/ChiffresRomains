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

    @Test
    void devrait_convertir_2_en_II() {
        ArabicRomanNumerals conversion = new ArabicRomanNumerals();
        // GIVEN
        int nbreArabe = 2;
        // WHEN
        String resultat = conversion.convert(nbreArabe);
        // THEN
        assertEquals("II", resultat);
    }

    @Test
    void devrait_convertir_3_en_III() {
        ArabicRomanNumerals conversion = new ArabicRomanNumerals();
        // GIVEN
        int nbreArabe = 3;
        // WHEN
        String resultat = conversion.convert(nbreArabe);
        // THEN
        assertEquals("III", resultat);
    }

    @Test
    void devrait_convertir_10_en_X() {
        ArabicRomanNumerals conversion = new ArabicRomanNumerals();
        // GIVEN
        int nbreArabe = 10;
        // WHEN
        String resultat = conversion.convert(nbreArabe);
        // THEN
        assertEquals("III", resultat);
    }
}