package com.company.Netex.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;

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

    public MovieCatalog(long id, int year, String name, String title, String imdbID, String type, String poster) {
        this.id = id;
        this.year = year;
        this.name = name;
        this.title = title;
        this.imdbID = imdbID;
        this.type = type;
        this.poster = poster;
    }
}

