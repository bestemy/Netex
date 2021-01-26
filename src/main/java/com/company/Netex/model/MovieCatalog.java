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

    }

