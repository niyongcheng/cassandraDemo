package com.herbalife.gts.service;

import com.herbalife.gts.model.OrderHeader;
import com.herbalife.gts.repository.OrderHeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderHeaderService {

    @Autowired
    private OrderHeaderRepository orderHeaderRepository;

    public void orderHeaderSave(OrderHeader orderHeader){
        orderHeaderRepository.save(orderHeader);
    }
}
