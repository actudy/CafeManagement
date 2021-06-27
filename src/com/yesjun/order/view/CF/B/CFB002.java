package com.yesjun.order.view.CF.B;

import com.yesjun.order.view.OrderVw;
import com.yesjun.order.view.pop.OrderAdd;
import com.yesjun.order.view.pop.OrderCancel;
import com.yesjun.order.view.pop.OrderInfo;

import java.util.HashMap;

public class CFB002 extends OrderVw {
    @Override
    public void process() throws Exception {
        HashMap<String, String> argMap = new HashMap<>();

        OrderAdd orderAdd = new OrderAdd();
        OrderCancel orderCancel = new OrderCancel();
        OrderInfo orderInfo = new OrderInfo();

        String MENU_NM = "";     // 메뉴명
        String MENU_SIZE = "";   // 메뉴 크기
        String TAKE_OUT_YN = ""; // 테이크아웃 여부
        String MENU_AMT = "";    // 메뉴금액

        String MENU_SIZE_NM = "";
        String TAKE_OUT_YN_NM = "";

        MENU_NM = "자몽에이드";
        MENU_AMT = "3000";
        argMap.put("MENU_NM", MENU_NM);
        argMap.put("MENU_AMT", MENU_AMT);
        System.out.println(MENU_NM);

        MENU_SIZE = scanStr("1.S(+0원) 2.M(+500원) 3.L(+1000원) 선택 (주문취소:C) : ");
        if(MENU_SIZE.equalsIgnoreCase("1")) {
            MENU_SIZE_NM = "S";
        } else if(MENU_SIZE.equalsIgnoreCase("2")) {
            MENU_SIZE_NM = "M";
        } else if(MENU_SIZE.equalsIgnoreCase("3")) {
            MENU_SIZE_NM = "L";
        }
        if(MENU_SIZE.equalsIgnoreCase("C")) {
            orderCancel.showCancel();
        }
        argMap.put("MENU_SIZE", MENU_SIZE);
        orderInfo.showCurrInfo(MENU_NM, MENU_SIZE_NM);

        TAKE_OUT_YN = scanStr("1.매장이용(+500원) 2.테이크아웃 선택 (주문취소:C) : ");
        if(TAKE_OUT_YN.equalsIgnoreCase("1")) {
            TAKE_OUT_YN_NM = "매장이용";
        } else if(TAKE_OUT_YN.equalsIgnoreCase("2")) {
            TAKE_OUT_YN_NM = "테이크아웃";
        }
        if(TAKE_OUT_YN.equalsIgnoreCase("C")) {
            orderCancel.showCancel();
        }
        argMap.put("TAKE_OUT_YN", TAKE_OUT_YN);
        orderInfo.showCurrInfo(MENU_NM, MENU_SIZE_NM, TAKE_OUT_YN_NM);

        System.out.println("추가주문확인");
        orderAdd.showAdd(argMap);

        orderInfo.showInfo();
    }
}
