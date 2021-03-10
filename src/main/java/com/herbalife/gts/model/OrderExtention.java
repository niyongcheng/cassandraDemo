package com.herbalife.gts.model;

import com.datastax.driver.mapping.annotations.Field;
import com.datastax.driver.mapping.annotations.UDT;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@UDT(name = "OrderExtention")
public class OrderExtention {

    @Field
    private String channel;
    @Field
    private BigDecimal totalFreight;
    @Field
    private BigDecimal payFreight;
    @Field
    private BigDecimal exchangedFreight;
    @Field
    private BigInteger exchangedPoints;

}
