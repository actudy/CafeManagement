package com.yesjun.order.service;

import com.yesjun.order.dao.OrderDao;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderService {
    private OrderDao orderDao;

    public OrderService() {
        orderDao = new OrderDao();
    }

    public void insert(ArrayList<HashMap<String, String>> argList) {
        orderDao.insert(argList);
    }

    public ArrayList<HashMap<String, String>> select() {
        return orderDao.select();
    }

    public void clear() { orderDao.clear(); }
}
