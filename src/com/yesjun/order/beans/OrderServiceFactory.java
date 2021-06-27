package com.yesjun.order.beans;

import com.yesjun.order.service.OrderService;

public class OrderServiceFactory {
    private static OrderService service = null;

    public static synchronized OrderService getInstance() {
        if(service == null) {
            service = new OrderService();
            return service;
        }
        return service;
    }
}
