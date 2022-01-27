package com.graphql_springboot.models.request.record;

import lombok.Data;

@Data
public class UrlInfo {

    private String url;
    private long timeInMs;
}
