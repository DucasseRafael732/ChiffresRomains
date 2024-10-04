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
    void devrait_convertir_4_en_IV() {
        ArabicRomanNumerals conversion = new ArabicRomanNumerals();
        // GIVEN
        int nbreArabe = 4;
        // WHEN
        String resultat = conversion.convert(nbreArabe);
        // THEN
        assertEquals("IV", resultat);
    }

    @Test
    void devrait_convertir_5_en_V() {
        ArabicRomanNumerals conversion = new ArabicRomanNumerals();
        // GIVEN
        int nbreArabe = 5;
        // WHEN
        String resultat = conversion.convert(nbreArabe);
        // THEN
        assertEquals("V", resultat);
    }

    @Test
    void devrait_convertir_6_en_VI() {
        ArabicRomanNumerals conversion = new ArabicRomanNumerals();
        // GIVEN
        int nbreArabe = 5;
        // WHEN
        String resultat = conversion.convert(nbreArabe);
        // THEN
        assertEquals("V", resultat);
    }


    @Test
    void devrait_convertir_9_en_IX() {
        ArabicRomanNumerals conversion = new ArabicRomanNumerals();
        // GIVEN
        int nbreArabe = 9;
        // WHEN
        String resultat = conversion.convert(nbreArabe);
        // THEN
        assertEquals("IX", resultat);
    }

    @Test
    void devrait_convertir_10_en_X() {
        ArabicRomanNumerals conversion = new ArabicRomanNumerals();
        // GIVEN
        int nbreArabe = 10;
        // WHEN
        String resultat = conversion.convert(nbreArabe);
        // THEN
        assertEquals("X", resultat);
    }

    @Test
    void devrait_convertir_12_en_XII() {
        ArabicRomanNumerals conversion = new ArabicRomanNumerals();
        // GIVEN
        int nbreArabe = 12;
        // WHEN
        String resultat = conversion.convert(nbreArabe);
        // THEN
        assertEquals("XII", resultat);
    }

    @Test
    void devrait_convertir_39_en_XXXIX() {
        ArabicRomanNumerals conversion = new ArabicRomanNumerals();
        // GIVEN
        int nbreArabe = 39;
        // WHEN
        String resultat = conversion.convert(nbreArabe);
        // THEN
        assertEquals("XXXIX", resultat);
    }
}