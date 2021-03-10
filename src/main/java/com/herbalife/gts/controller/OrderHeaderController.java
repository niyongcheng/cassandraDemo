package com.herbalife.gts.controller;

import com.herbalife.gts.model.OrderHeader;
import com.herbalife.gts.service.OrderHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class OrderHeaderController {

    @Autowired
    private OrderHeaderService orderHeaderService;

    @PostMapping("orderHeader")
    public void OrderHeaderSave(@RequestBody OrderHeader orderheader){
        orderHeaderService.orderHeaderSave(orderheader);
    }
}
