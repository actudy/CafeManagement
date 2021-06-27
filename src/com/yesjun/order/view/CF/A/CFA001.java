package com.yesjun.order.view.CF.A;

import com.yesjun.order.view.OrderVw;
import com.yesjun.order.view.pop.OrderAdd;
import com.yesjun.order.view.pop.OrderCancel;
import com.yesjun.order.view.pop.OrderInfo;

import java.util.HashMap;

public class CFA001 extends OrderVw {
    @Override
    public void process() throws Exception {
        HashMap<String, String> argMap = new HashMap<>();

        OrderAdd orderAdd = new OrderAdd();
        OrderCancel orderCancel = new OrderCancel();
        OrderInfo orderInfo = new OrderInfo();

        String MENU_NM = "";     // 메뉴명
        String TMPRT_CD = "";    // 온도구분코드
        String SHOT_CNT = "";    // 샷 추가 수
        String MENU_SIZE = "";   // 메뉴 크기
        String TAKE_OUT_YN = ""; // 테이크아웃 여부
        String MENU_AMT = "";    // 메뉴금액

        String TMPRT_CD_NM = "";
        String SHOT_CNT_NM = "";
        String MENU_SIZE_NM = "";
        String TAKE_OUT_YN_NM = "";

        MENU_NM = "아메리카노";
        MENU_AMT = "1000";
        argMap.put("MENU_NM", MENU_NM);
        argMap.put("MENU_AMT", MENU_AMT);
        System.out.println(MENU_NM);

        TMPRT_CD = scanStr("1.ICE 2.HOT 선택 (주문취소:C) : ");
        if(TMPRT_CD.equalsIgnoreCase("1")) {
            TMPRT_CD_NM = "ICE";
        } else if(TMPRT_CD.equalsIgnoreCase("2")) {
            TMPRT_CD_NM = "HOT";
        }
        if(TMPRT_CD.equalsIgnoreCase("C")) {
            orderCancel.showCancel();
        }
        argMap.put("TMPRT_CD", TMPRT_CD);
        orderInfo.showCurrInfo(MENU_NM, TMPRT_CD_NM);

        SHOT_CNT = scanStr("1.1샷(+0원) 2.2샷(+500원) 선택 (주문취소:C) : ");
        if(SHOT_CNT.equalsIgnoreCase("1")) {
            SHOT_CNT_NM = SHOT_CNT + "샷";
        } else if(SHOT_CNT.equalsIgnoreCase("2")) {
            SHOT_CNT_NM = SHOT_CNT + "샷";
        }
        if(SHOT_CNT.equalsIgnoreCase("C")) {
            orderCancel.showCancel();
        }
        argMap.put("SHOT_CNT", SHOT_CNT);
        orderInfo.showCurrInfo(MENU_NM, TMPRT_CD_NM, SHOT_CNT_NM);

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
        orderInfo.showCurrInfo(MENU_NM, TMPRT_CD_NM, SHOT_CNT_NM, MENU_SIZE_NM);

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
        orderInfo.showCurrInfo(MENU_NM, TMPRT_CD_NM, SHOT_CNT_NM, MENU_SIZE_NM, TAKE_OUT_YN_NM);

        System.out.println("추가주문확인");
        orderAdd.showAdd(argMap);

        orderInfo.showInfo();
    }
}
