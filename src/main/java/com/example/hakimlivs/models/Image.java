package com.example.hakimlivs.models;

import lombok.Data;
import javax.persistence.*;

/**
 * Created by Lukas Aronsson
 * Date: 14/04/2021
 * Time: 16:31
 * Project: WebshopHakimsLivs
 * Copyright: MIT
 **/
@Data
@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     
    private String image;

    @ManyToOne
    private Product product;
}