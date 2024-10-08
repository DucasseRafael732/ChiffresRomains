package com.rafael.ArabicRomanNumerals;

public class ArabicRomanNumerals {

    public String convert(int nbre) {

        int[] valeursArabes = {1000, 500, 100, 50, 40, 10, 9, 5, 4, 1};
        String[] SymbolesRomains = {"M", "D", "C", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder resultat = new StringBuilder();

        for (int i = 0; i < valeursArabes.length; i++) {
            while (nbre >= valeursArabes[i]) {
                resultat.append(SymbolesRomains[i]);
                nbre -= valeursArabes[i];
            }
        }
        return resultat.toString();
    }

}