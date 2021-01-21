package com.company.Netex.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.JSONException;
import org.json.JSONObject;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;

@Entity
@NoArgsConstructor
@Data

public class MovieCatalog {
    @Id
    long id;
    int year;
    String name;
    String title;
    String imdbID;
    String type;
    String poster;

}

