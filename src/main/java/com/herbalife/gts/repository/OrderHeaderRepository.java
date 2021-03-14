package com.herbalife.gts.repository;

import com.herbalife.gts.model.OrderHeader;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import org.springframework.data.cassandra.repository.support.SimpleCassandraRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;


/**
 * @author yongchengn
 */
@Repository
@EnableCassandraRepositories
public interface OrderHeaderRepository extends CassandraRepository<OrderHeader, BigInteger> {
}
