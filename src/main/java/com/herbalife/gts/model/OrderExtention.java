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
public class OrderExtention {

    private String channel;
    private BigDecimal totalFreight;
    private BigDecimal payFreight;
    private BigDecimal exchangedFreight;

    private BigInteger exchangedPoints;

}
