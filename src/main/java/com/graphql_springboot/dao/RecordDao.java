package com.graphql_springboot.dao;

import com.graphql_springboot.entities.Record;
import com.graphql_springboot.models.request.record.CreateRecordRequest;
import org.springframework.stereotype.Component;

@Component
public interface RecordDao {

    Record create(CreateRecordRequest request);

    Record getById(String Id);
}
