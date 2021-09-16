package com.adhoc.progpractice;

import java.util.regex.Pattern;

public class RegularExpressionDemo {
    public static void main(String[] args) {
        String urlContents = "samples 21666853300";
        // regular expression for an integer number
        String regex = "[+-]?[0-9]+";
        Pattern pattern = Pattern.compile(regex);

        int tempcnt = 0;
        for (int i = 0; i < urlContents.length(); i++) {
            if (pattern.matcher(urlContents).find()) {
                tempcnt++;
                System.out.print(urlContents.charAt(i) + ", ");
            }
        }
        System.out.println(tempcnt + " - count");
    }
}
