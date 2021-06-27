package com.yesjun.order.view;


import com.yesjun.order.config.OrderVwMapping;

public class HomeVw extends OrderVw {
    String[] key = {
            "",
            "CFA001",
            "CFA002",
            "CFB001",
            "CFB002",
            "CFC001",
            "CFC002",
    };

    @Override
    public void process() throws Exception {
        OrderVwMapping mapping = new OrderVwMapping();

        while(true) {
            int type = menu();
            if(type >= key.length) {
                System.out.println("");
                continue;
            }

            OrderVwImpl view = mapping.getOrderVw(key[type]);
            if(view != null) {
                view.process();
            }
        }
    }

    private int menu() {
        System.out.println("메뉴");
        System.out.println("1.아메리카노 1000원");
        System.out.println("2.바닐라라떼 2500원");
        System.out.println("3.레몬에이드 3000원");
        System.out.println("4.자몽에이드 3000원");
        System.out.println("5.수박주스 4000원");
        System.out.println("6.토마토주스 4000원");
        System.out.println("----------------------------------------");
        int type = scanInt("음료를 선택해주세요 : ");
        return type;
    }
}
