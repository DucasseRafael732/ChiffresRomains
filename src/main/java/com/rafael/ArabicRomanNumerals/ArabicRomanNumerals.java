package com.rafael.ArabicRomanNumerals;

public class ArabicRomanNumerals {

    public String convert(int nbre) {
        StringBuilder resultat = new StringBuilder();

        if (nbre >= 10) {
            resultat.append("X");
            nbre -= 10;
        }

        if (nbre >= 9) {
            resultat.append("IX");
            nbre = 0;
        }

        if (nbre >= 5) {
            resultat.append("V");
            nbre -= 5;
        }

        if (nbre >= 4) {
             resultat.append("IV");
             nbre = 0;
        } else if (nbre >= 1) {
            for (int i = 0; i < nbre; i++) {
                resultat.append("I");
            }
        }
        return resultat.toString();
    }

}