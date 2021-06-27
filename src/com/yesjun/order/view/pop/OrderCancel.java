package com.yesjun.order.view.pop;

import com.yesjun.order.view.HomeVw;
import com.yesjun.order.view.OrderVw;

public class OrderCancel extends OrderVw {
    @Override
    public void process() throws Exception {
        // TODO
    }

    public void showCancel() throws Exception {
        String ORDER_CANCEL_YN = scanStr("주문을 취소하시겠습니까?(Y/N) : ");
        if(ORDER_CANCEL_YN.equalsIgnoreCase("Y")) {
            System.out.println("\"주문이 취소되었습니다. 다시 주문해주세요.\"");
            orderService.clear();
            new HomeVw().process();
        } else if(ORDER_CANCEL_YN.equalsIgnoreCase("N")) {
            return;
        }
    }
}
