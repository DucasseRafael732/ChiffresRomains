package com.rafael.ArabicRomanNumerals;

public class ArabicRomanNumerals {

    public String convert(int nbre) {
        StringBuilder resultat = new StringBuilder();

        if (nbre >= 5) {
            resultat.append("V");
            nbre -= 5;
        }

        if (nbre >= 4) {
             resultat.append("IV");
        } else if (nbre >= 1) {
            for (int i = 0; i < nbre; i++) {
                resultat.append("I");
            }
        }

        return resultat.toString();
    }

}