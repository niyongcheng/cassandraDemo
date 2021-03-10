package com.herbalife.gts.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class OrderDelivery {

    private String orderDeliveryType;
    private String senderName;
    private String senderProvince;
    private String senderCity;
    private String senderDistrict;
    private String senderAddress;
    private String senderCompany;
    private String senderPhone;
    private String senderMobile;

    private BigInteger expressCompanyId;
}
