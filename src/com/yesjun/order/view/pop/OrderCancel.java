package com.yesjun.order.view.pop;

import com.yesjun.order.view.HomeVw;
import com.yesjun.order.view.OrderVw;

public class OrderCancel extends OrderVw {
    @Override
    public void process() throws Exception {
        // TODO
    }

    public void showCancel() throws Exception {
        String ORDER_CANCEL_YN = scanStr("�ֹ��� ����Ͻðڽ��ϱ�?(Y/N) : ");
        if(ORDER_CANCEL_YN.equalsIgnoreCase("Y")) {
            System.out.println("\"�ֹ��� ��ҵǾ����ϴ�. �ٽ� �ֹ����ּ���.\"");
            orderService.clear();
            new HomeVw().process();
        } else if(ORDER_CANCEL_YN.equalsIgnoreCase("N")) {
            return;
        }
    }
}
