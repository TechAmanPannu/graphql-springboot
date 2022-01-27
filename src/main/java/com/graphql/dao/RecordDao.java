package com.graphql.dao;

import com.graphql.entities.Record;
import com.graphql.models.request.record.CreateRecordRequest;
import org.springframework.stereotype.Component;

@Component
public interface RecordDao {

    Record create(CreateRecordRequest request);

    Record getById(String Id);
}
