package com.adhoc.progpractice.assignment;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlHandlerUtility {
    public static URLConnection getUrlConnection(String requiredUrl) {
        {
            URLConnection urlcon = null;
            try {
                URL url = new URL(requiredUrl);
                urlcon = url.openConnection();
            } catch (MalformedURLException e) {
                System.out.println("Malformed URL: " + e.getMessage());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return urlcon;
        }
    }
}
