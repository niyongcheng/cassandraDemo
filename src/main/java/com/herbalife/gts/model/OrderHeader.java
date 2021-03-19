package com.herbalife.gts.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

@Table
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderHeader {

    @PrimaryKey
    private BigInteger orderHeaderId;

    @Column
    private BigInteger customerProfileID;

    @Column
    private String storeOrderID;

    @Column
    private BigInteger procStoreID;

    @Column
    private BigInteger shipStoreID;

    /*@Column
    private BigDecimal totalAmount;

    @Column
    private LocalDateTime createdOn;

    @Column
    private LocalDateTime updatedOn;

    @Column
    private String createdBy;

    @Column
    private String updatedBy;

    @Column
    private Boolean isDeleted;*/

    @Column
    List<OrderDelivery> orderDeliverys;

    @Column
    List<OrderDetail> orderDetails;

    @Column
    List<OrderExtention> orderExtentions;

}
