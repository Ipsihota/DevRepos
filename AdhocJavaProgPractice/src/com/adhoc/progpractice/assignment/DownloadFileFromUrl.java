package com.adhoc.progpractice.assignment;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/*
        https://www.wireshark.org/download.html
        i.	Obtain the URL for “Windows Installer (64-bit)”
        ii.	Download the binary from the obtained URL and store it in a S3 bucket.
 */
public class DownloadFileFromUrl {
    public static void main(String[] args) {
        URL url = null;
        URLConnection urlconnection = null;
        int contentLength = 0;
        int ch = 0;
        StringBuffer rec = new StringBuffer(" ");
//        try {
        String requiredUrl = "https://www.wireshark.org/download.html";
        urlconnection = UrlHandlerUtility.getUrlConnection(requiredUrl);
        contentLength = urlconnection.getContentLength();
//        }
//        catch (IOException e1) {
//            System.out.println(e1);
//        }
        if (contentLength > 0) {
            try {
                InputStream in = urlconnection.getInputStream();
                while ((ch = in.read()) != -1) {
                    rec.append((char) ch);
                }
            } catch (IOException e2) {
                System.out.println("IOException " + e2);
            }
            String htmlrec = rec.toString();
            System.out.println("ipsita"+ htmlrec);
        }
    }
}
