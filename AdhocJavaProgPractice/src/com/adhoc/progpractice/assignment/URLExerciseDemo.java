package com.adhoc.progpractice.assignment;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/*
    https://www.dropbox.com/download?plat=win&full=1
    i.	Obtain the headers of this page
    ii.	Find out the file name of the file that’s getting downloaded
    iii.Obtain the version from the file name / path

 */

public class URLExerciseDemo {
    static String requiredUrl = "https://www.dropbox.com/download?plat=win&full=1";

    public static void main(String[] args) {
        getUrlHeader(requiredUrl);
        String fileName = downloadedFileName(requiredUrl);
        System.out.println("File Name: " + fileName);
    }

    protected static String downloadedFileName(String requiredUrl) {
        HttpURLConnection urlconn = (HttpURLConnection) UrlHandlerUtility.getUrlConnection(requiredUrl);
        String directory = "C:\\Users\\Dell\\Downloads";

        int responseCode = 0;
        try {
            responseCode = urlconn.getResponseCode();
        } catch (IOException e) {
            e.getMessage();
        }

        // checking HTTP response code first
        if (responseCode == HttpURLConnection.HTTP_OK) {
            File dir = new File(directory);
            if (dir.isDirectory()) {
                Optional<File> opFile = Arrays.stream(dir.listFiles(File::isFile))
                        .max((f1, f2) -> Long.compare(f1.lastModified(), f2.lastModified()));

                if (opFile.isPresent()) {
                    System.out.println("Path : " + opFile.get().getAbsolutePath());
                    return opFile.get().getName();
                }
            }
        }
        return null;
    }

    protected static void getUrlHeader(String requiredUrl) {
        URLConnection urlconn = UrlHandlerUtility.getUrlConnection(requiredUrl);
        Map<String, List<String>> map = urlconn.getHeaderFields();

        for (Map.Entry<String, List<String>> listEntry : map.entrySet()) {
            System.out.println(listEntry.getKey() + ", " + listEntry.getValue());
        }
    }
}
