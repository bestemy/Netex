package com.company.Netex;

import com.company.Netex.model.MovieCatalog;
import com.company.Netex.model.User;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;


@SpringBootApplication
public class MovieCatalogApplication extends MovieCatalog {


    private static String readAll(Reader rd) throws IOException {
    StringBuilder sb = new StringBuilder();
    int cp;
    while ((cp = rd.read()) != -1) {
        sb.append((char) cp);
    }
    return sb.toString();
}

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }

    public static void main(String[] args) throws IOException, JSONException {
        SpringApplication.run(MovieCatalogApplication.class, args);

        JSONObject json = readJsonFromUrl("http://www.omdbapi.com/?s=star&wars&apikey=e12179bf");
        System.out.println(json.toString(1));

        String jsonString = json.toString(1);
        JSONObject obj = new JSONObject(jsonString);
        JSONArray arr = obj.getJSONArray("Search");
        for (int i = 0; i < arr.length(); i++) {

            String type = arr.getJSONObject(i).getString("Type");
            String year = arr.getJSONObject(i).getString("Year");
            String imdbID = arr.getJSONObject(i).getString("imdbID");
            String poster = arr.getJSONObject(i).getString("Poster");
            String title = arr.getJSONObject(i).getString("Title");

            System.out.println(type);
            System.out.println(year);
            System.out.println(imdbID);
            System.out.println(poster);
            System.out.println(title);

        }
    }
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



