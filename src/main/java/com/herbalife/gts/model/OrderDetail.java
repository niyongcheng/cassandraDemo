package com.herbalife.gts.model;

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
public class OrderDetail {

    private BigInteger productID;
    private BigInteger quantity;

    private BigDecimal unitPrice;
    private BigDecimal volumePoint;
    private BigDecimal beforeDiscTaxAmount;
    private BigDecimal afterDiscTaxAmount;
    private BigDecimal discount;
}
