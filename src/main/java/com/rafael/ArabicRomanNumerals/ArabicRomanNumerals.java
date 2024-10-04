package com.rafael.ArabicRomanNumerals;

public class ArabicRomanNumerals {

    public String convert(int nbre) {
        StringBuilder resultat = new StringBuilder();

            
            for (int i = 0; i < nbre; i++) {
                resultat.append("I");
            }
        return resultat.toString();
    }

}