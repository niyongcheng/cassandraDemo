package com.herbalife.gts.repository;

import com.herbalife.gts.model.OrderHeader;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;


/**
 * @author yongchengn
 */
public interface OrderHeaderRepository extends CrudRepository<OrderHeader, BigInteger> {
}
