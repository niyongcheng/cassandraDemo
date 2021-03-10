package com.herbalife.gts.model;

import com.datastax.driver.mapping.annotations.Field;
import com.datastax.driver.mapping.annotations.Frozen;
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

    @Field
    private BigInteger customerProfileID;

    @Field
    private String storeOrderID;

    @Field
    private BigInteger procStoreID;

    @Field
    private BigInteger shipStoreID;

    @Field
    private BigDecimal totalAmount;

    @Field
    private LocalDateTime createdOn;

    @Field
    private LocalDateTime updatedOn;

    @Field
    private String createdBy;

    @Field
    private String updatedBy;

    @Field
    private Boolean isDeleted;

    @Frozen
    List<OrderDelivery> orderDeliveryList;

    @Frozen
    List<OrderDetail> orderDetailList;

    @Frozen
    List<OrderExtention> orderExtentionList;

}
