package com.herbalife.gts.model;

import com.datastax.driver.mapping.annotations.Table;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

@Table(name = "OrderHeader")
@Data
public class OrderHeader {

    @PrimaryKey
    private BigInteger orderHeaderId;

    private BigInteger customerProfileID;

    private String storeOrderID;

    private BigInteger procStoreID;

    private BigInteger shipStoreID;

    private BigDecimal totalAmount;

    private LocalDateTime createdOn;

    private LocalDateTime updatedOn;

    private String createdBy;

    private String updatedBy;

    private Boolean isDeleted;

    List<OrderDelivery> orderDeliveryList;

    List<OrderDetail> orderDetailList;

    List<OrderExtention> orderExtentionList;

}
