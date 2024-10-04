package com.rafael.ArabicRomanNumerals;

public class ArabicRomanNumerals {

    public String convert(int nbre) {
        StringBuilder resultat = new StringBuilder();

        if (nbre >= 4) {
            return "IV";
        } else if (nbre >= 1) {
            for (int i = 0; i < nbre; i++) {
                resultat.append("I");
            }
        }

        return resultat.toString();
    }

}