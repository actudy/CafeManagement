package com.yesjun.order.view;

import com.yesjun.order.beans.OrderServiceFactory;
import com.yesjun.order.service.OrderService;

import java.util.Scanner;

public abstract class OrderVw implements OrderVwImpl {
    private Scanner sc;
    protected OrderService orderService;
    public OrderVw() {
        sc = new Scanner(System.in);
        orderService = OrderServiceFactory.getInstance();
    }

    protected int scanInt(String msg) {
        System.out.print(msg);
        return Integer.parseInt(sc.nextLine());
    }

    protected String scanStr(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }
}
