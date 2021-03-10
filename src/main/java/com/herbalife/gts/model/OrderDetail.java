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
@UDT(name = "OrderDetail")
public class OrderDetail {
    @Field
    private BigInteger productID;
    @Field
    private BigInteger quantity;
    @Field
    private BigDecimal unitPrice;
    @Field
    private BigDecimal volumePoint;
    @Field
    private BigDecimal beforeDiscTaxAmount;
    @Field
    private BigDecimal afterDiscTaxAmount;
    @Field
    private BigDecimal discount;
}
