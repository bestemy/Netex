package com.company.Netex.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONException;
import org.json.JSONObject;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@Data
@Entity
public class User {
    @Id
    long id;
    int year;
    String name;
    String title;





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
        JSONObject json = readJsonFromUrl("http://www.omdbapi.com/?s=star&wars&apikey=e12179bf");
        System.out.println(json.toString(1));
//        System.out.println(json.toString(json.getInt("Year")));
//        System.out.println(json.getJSONArray("Title"));
    }
}


//    public static class SteamService {
//        public static Result getMatchHistory(String steamid){
//            Result result = new Result() {
//                @Override
//                public void setSystemId(String systemId) {
//
//                }
//
//                @Override
//                public String getSystemId() {
//                    return null;
//                }
//            };
//            String MatchHistoryUrl = "http://www.omdbapi.com/?s=star&wars&apikey=e12179bf"+steamid;
//            RestTemplate restTemplate = new RestTemplate();
//            Result jsonresult = restTemplate.getForObject(MatchHistoryUrl, Result.class);
//            return jsonresult;
//        }
//    }
//}