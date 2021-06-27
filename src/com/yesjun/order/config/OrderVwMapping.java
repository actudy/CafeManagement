package com.yesjun.order.config;

import com.yesjun.order.view.OrderVwImpl;

import java.util.HashMap;

public class OrderVwMapping {
    private HashMap<String, OrderVwImpl> mapping;

    public OrderVwMapping() throws Exception {
        mapping = new HashMap<>();

        try {
            OrderProperties prop = new OrderProperties();

            String key = "";
            String className = "";
            for (int i = 0; i < prop.size(); ++i) {
                key = prop.keys()[i];
                className = prop.get(key);
                mapping.put(key, (OrderVwImpl) Class.forName(className).newInstance());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public OrderVwImpl getOrderVw(String key) {
        return (OrderVwImpl) mapping.get(key);
    }
}
