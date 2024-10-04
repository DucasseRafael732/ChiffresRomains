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
    void devrait_convertir_38_en_XXXVIII() {
        ArabicRomanNumerals conversion = new ArabicRomanNumerals();
        // GIVEN
        int nbreArabe = 38;
        // WHEN
        String resultat = conversion.convert(nbreArabe);
        // THEN
        assertEquals("XXXVIII", resultat);
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

    @Test
    void devrait_convertir_40_en_XL() {
        ArabicRomanNumerals conversion = new ArabicRomanNumerals();
        // GIVEN
        int nbreArabe = 40;
        // WHEN
        String resultat = conversion.convert(nbreArabe);
        // THEN
        assertEquals("XL", resultat);
    }

    @Test
    void devrait_convertir_50_en_L() {
        ArabicRomanNumerals conversion = new ArabicRomanNumerals();
        // GIVEN
        int nbreArabe = 50;
        // WHEN
        String resultat = conversion.convert(nbreArabe);
        // THEN
        assertEquals("L", resultat);
    }

    @Test
    void devrait_convertir_70_en_LXX() {
        ArabicRomanNumerals conversion = new ArabicRomanNumerals();
        // GIVEN
        int nbreArabe = 70;
        // WHEN
        String resultat = conversion.convert(nbreArabe);
        // THEN
        assertEquals("LXX", resultat);
    }

    @Test
    void devrait_convertir_100_en_C() {
        ArabicRomanNumerals conversion = new ArabicRomanNumerals();
        // GIVEN
        int nbreArabe = 100;
        // WHEN
        String resultat = conversion.convert(nbreArabe);
        // THEN
        assertEquals("C", resultat);
    }


    @Test
    void devrait_convertir_139_en_CXXXIX() {
        ArabicRomanNumerals conversion = new ArabicRomanNumerals();
        // GIVEN
        int nbreArabe = 139;
        // WHEN
        String resultat = conversion.convert(nbreArabe);
        // THEN
        assertEquals("CXXXIX", resultat);
    }

    @Test
    void devrait_convertir_5689_en_CXXXIX() {
        ArabicRomanNumerals conversion = new ArabicRomanNumerals();
        // GIVEN
        int nbreArabe = 5689;
        // WHEN
        String resultat = conversion.convert(nbreArabe);
        // THEN
        assertEquals("MMMMMDCLXXXIX", resultat);
    }
}