package com.yesjun.order.dao;

import com.yesjun.order.repository.OrderRepository;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderDao {
    public void insert(ArrayList<HashMap<String, String>> argList) { OrderRepository.stores = argList; }

    public ArrayList<HashMap<String, String>> select() { return (ArrayList<HashMap<String, String>>) OrderRepository.stores; }

    public void clear() {
        OrderRepository.stores.clear();
    }
}
