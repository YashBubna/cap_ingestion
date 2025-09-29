package com.capestone.ingestion.main.model;


import jakarta.persistence.Id;

import java.time.LocalDate;

public class Info {
@Id
    private int id;
    private int partnerId;
    private int ConfigId;
    private status infoStatus;
    private LocalDate date=LocalDate.now();
    private String error;
    private String transform;
    private int transformCount;



}
