package com.herbalife.gts.repository;

import com.herbalife.gts.model.OrderHeader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class OrderHeaderRepository {

    @Autowired
    private CassandraTemplate cassendraTemplate;

    public void OrderHeaderSave(OrderHeader orderHeader){
        //
        OrderHeader result = cassendraTemplate.insert(orderHeader);
        //
        log.info(result.getOrderHeaderId().toString());
    }
}
