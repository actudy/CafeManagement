package com.yesjun.order;

import com.yesjun.order.view.HomeVw;

public class OrderApplication {
    public static void main(String[] args) {
        HomeVw vw = new HomeVw();
        try {
            vw.process();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
