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
        System.out.println("�޴�");
        System.out.println("1.�Ƹ޸�ī�� 1000��");
        System.out.println("2.�ٴҶ�� 2500��");
        System.out.println("3.�����̵� 3000��");
        System.out.println("4.�ڸ����̵� 3000��");
        System.out.println("5.�����ֽ� 4000��");
        System.out.println("6.�丶���ֽ� 4000��");
        System.out.println("----------------------------------------");
        int type = scanInt("���Ḧ �������ּ��� : ");
        return type;
    }
}
