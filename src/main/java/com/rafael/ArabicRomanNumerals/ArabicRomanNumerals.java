package com.rafael.ArabicRomanNumerals;


public class ArabicRomanNumerals {

    public String convert(int nbre) {

        if(nbre == 1){
            return "I";
        }
        else if(nbre == 3){
            return "III";
        }

        return null;
    }
}
