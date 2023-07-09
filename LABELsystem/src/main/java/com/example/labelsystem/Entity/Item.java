package com.example.labelsystem.Entity;

import lombok.Data;


@Data
public class Item {
    private String itemId;
    private String url;
    private String tags;
    private int    isTag;
}
