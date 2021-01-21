package com.company.Netex;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;


@SpringBootApplication
public class MovieCatalogApplication<Person> {

    public static void main(String[] args) {
        SpringApplication.run(MovieCatalogApplication.class, args);
    }












//    try
//
//    {
//
//
//        String URL = "http://www.omdbapi.com/?s=star&wars&apikey=e12179bf";
//        URL obj = new URL(url);
//        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//
//        int responseCode = con.getResponseCode();
//        System.out.println("\nSending 'GET' request to URL : " + url);
//        System.out.println("ResponseCode : " + responseCode);
//        BufferedReader in = null;
//
//        in = new BufferedReader(
//                new IntputStreamReader(con.getInputStream()));
//
//        String imputLine;
//        StringBuffer response = new StringBuffer();
//        while ((imputLine = readLine()) != null) {
//            response.append(imputLine);
//        }
//
//        in.close;
//    }
}


