package com.adhoc.progpractice.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLConnection;

/*
https://support.techsmith.com/hc/en-us/articles/115006443267-Camtasia-Windows-Version-History
    i.	Search for “Camtasia Windows”
    ii.	Obtain the number next to this string having format – d+.d+.d+
(d+ means “a number with any number of digits”)
    iii.	There may be many such occurrences, return the maximum number

 */

public class MaxOccurrenceOfNumber {
    static String requiredUrl = "https://support.techsmith.com/hc/en-us/articles/115006443267-Camtasia-Windows-Version-History";

    public static void main(String[] args) {
        int maxCount = 0;

        //To get the contents of URL
        String urlContents = getUrlContents(requiredUrl);
        //To find out max occurrences of digits
        maxCount = getMaxOccurrencesOfDigit(urlContents);

        System.out.println("MaxOccurrenceOfNumber: " + maxCount);
    }

    protected static int getMaxOccurrencesOfDigit(String urlContents) {
        int result = -1;

        int[] count = new int[36000];
        for (int i = 0; i < urlContents.length(); i++) {
            if (urlContents.charAt(i) >= 48 && urlContents.charAt(i) <= 57)
                count[urlContents.charAt(i)]++;
        }
        for (int i = 0; i < urlContents.length(); i++) {
            if (urlContents.charAt(i) >= 48 && urlContents.charAt(i) <= 57) {
                result = count[urlContents.charAt(i)];
            }
        }
        return result;
    }

    protected static String getUrlContents(String requiredUrl) {
        StringBuilder content = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            URLConnection urlcon = UrlHandlerUtility.getUrlConnection(requiredUrl);

            bufferedReader = new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.getMessage();
            }
        }
        return content.toString();
    }
}