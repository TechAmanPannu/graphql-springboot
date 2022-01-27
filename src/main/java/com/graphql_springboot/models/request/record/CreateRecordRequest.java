package com.graphql_springboot.models.request.record;

import lombok.Data;

import java.util.List;

@Data
public class CreateRecordRequest {

    List<UrlInfo> urls;


}
