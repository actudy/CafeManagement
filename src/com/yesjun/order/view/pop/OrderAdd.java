package com.yesjun.order.view.pop;

import com.yesjun.order.view.HomeVw;
import com.yesjun.order.view.OrderVw;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderAdd extends OrderVw {
    private static ArrayList<HashMap<String, String>> tmpList = new ArrayList<>();

    @Override
    public void process() throws Exception {
        // TODO
    }

    public void showAdd(HashMap<String, String> argMap) throws Exception {
        tmpList.add(argMap);
        String ORDER_ADD_YN = scanStr("추가주문을 하시겠습니까?(Y/N)");
        if(ORDER_ADD_YN.equalsIgnoreCase("Y")) {
            new HomeVw().process();
        } else if(ORDER_ADD_YN.equalsIgnoreCase("N")) {
            orderService.insert(tmpList);
        }
    }
}
