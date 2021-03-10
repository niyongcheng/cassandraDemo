package com.herbalife.gts.model;

import com.datastax.driver.mapping.annotations.Field;
import com.datastax.driver.mapping.annotations.UDT;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@UDT(name = "OrderDelivery")
public class OrderDelivery {

    @Field
    private String orderDeliveryType;
    @Field
    private String senderName;
    @Field
    private String senderProvince;
    @Field
    private String senderCity;
    @Field
    private String senderDistrict;
    @Field
    private String senderAddress;
    @Field
    private String senderCompany;
    @Field
    private String senderPhone;
    @Field
    private String senderMobile;
    @Field
    private BigInteger expressCompanyId;
}
