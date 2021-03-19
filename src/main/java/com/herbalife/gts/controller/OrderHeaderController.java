package com.herbalife.gts.controller;

import com.herbalife.gts.model.OrderDelivery;
import com.herbalife.gts.model.OrderDetail;
import com.herbalife.gts.model.OrderExtention;
import com.herbalife.gts.model.OrderHeader;
import com.herbalife.gts.service.OrderHeaderService;
import javafx.scene.control.RadioMenuItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;

@RestController
@RequestMapping("api/v1")
public class OrderHeaderController {

    @Autowired
    private OrderHeaderService orderHeaderService;

    @PostMapping("orderHeader")
    public void OrderHeaderSave(@RequestBody OrderHeader orderheader){
        orderHeaderService.orderHeaderSave(orderheader);
    }

    @PostMapping("orderHeader/test")
    public void OrderHeaderTestSave(){

        OrderDelivery orderDelivery = OrderDelivery.builder()
                .expressCompanyId(3000)
                .orderDeliveryType("1")
                .senderAddress("shanghai")
                .senderCity("Shanghai")
                .senderCompany("EF")
                .senderDistrict("jingan")
                .senderMobile("13671727893")
                .senderName("yongcheng")
                .senderPhone("15855460176")
                .senderProvince("shanghai")
                .build();

        OrderExtention orderExtention = OrderExtention.builder()
                .channel("1")
                .exchangedFreight(new BigDecimal(1.00))
                .exchangedPoints(10000L)
                .payFreight( new BigDecimal(2.00))
                .totalFreight(new BigDecimal(2.00))
                .build();

        OrderDetail orderDetail = OrderDetail.builder()
                .afterDiscTaxAmount(new BigDecimal(1.00))
                .beforeDiscTaxAmount(new BigDecimal(2.00))
                .discount(new BigDecimal(3.00))
                .productID(10000L)
                .quantity(20000L)
                .unitPrice(new BigDecimal(4.00))
                .volumePoint(new BigDecimal(5.00))
                .build();

        ArrayList<OrderDelivery> orderDeliveries = new ArrayList<OrderDelivery>();
        orderDeliveries.add(orderDelivery);

        ArrayList<OrderDetail> orderDetails = new ArrayList<>();
        orderDetails.add(orderDetail);

        ArrayList<OrderExtention> orderExtentions = new ArrayList<>();
        orderExtentions.add(orderExtention);

        OrderHeader orderheader = OrderHeader.builder()
                //.createdBy("abc")
                .customerProfileID(getRandomInteger())
                .orderDeliverys(orderDeliveries)
                .orderDetails(orderDetails)
                .orderExtentions(orderExtentions)
                .orderHeaderId(getRandomInteger())
                .procStoreID(new BigInteger("888"))
                .shipStoreID(new BigInteger("666"))
                .storeOrderID("316lasdjf")
                .build();

        orderHeaderService.orderHeaderSave(orderheader);
    }

    private BigInteger getRandomInteger(){
        //
        Random random = new Random();
        return BigInteger.valueOf(random.ints(0,100000)
                .findFirst().getAsInt());
    }
}
