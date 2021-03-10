package com.herbalife.gts.repository;

import com.herbalife.gts.model.OrderHeader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.query.CassandraEntityInformation;
import org.springframework.data.cassandra.repository.support.SimpleCassandraRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
import java.util.UUID;

@Repository
@Slf4j
public class OrderHeaderRepository extends SimpleCassandraRepository<OrderHeader, BigInteger> {
    @Autowired
    public OrderHeaderRepository(CassandraEntityInformation<OrderHeader, BigInteger> metadata, CassandraOperations operations) {
        super(metadata, operations);
    }
}


    /*@Autowired
    private CassandraTemplate cassendraTemplate;

    public void OrderHeaderSave(OrderHeader orderHeader){
        //
        OrderHeader result = cassendraTemplate.insert(orderHeader);
        //
        log.info(result.getOrderHeaderId().toString());
    }*/

