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

        String MENU_NM = "";     // �޴���
        String MENU_SIZE = "";   // �޴� ũ��
        String TAKE_OUT_YN = ""; // ����ũ�ƿ� ����
        String MENU_AMT = "";    // �޴��ݾ�

        String MENU_SIZE_NM = "";
        String TAKE_OUT_YN_NM = "";

        MENU_NM = "�ڸ����̵�";
        MENU_AMT = "3000";
        argMap.put("MENU_NM", MENU_NM);
        argMap.put("MENU_AMT", MENU_AMT);
        System.out.println(MENU_NM);

        MENU_SIZE = scanStr("1.S(+0��) 2.M(+500��) 3.L(+1000��) ���� (�ֹ����:C) : ");
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

        TAKE_OUT_YN = scanStr("1.�����̿�(+500��) 2.����ũ�ƿ� ���� (�ֹ����:C) : ");
        if(TAKE_OUT_YN.equalsIgnoreCase("1")) {
            TAKE_OUT_YN_NM = "�����̿�";
        } else if(TAKE_OUT_YN.equalsIgnoreCase("2")) {
            TAKE_OUT_YN_NM = "����ũ�ƿ�";
        }
        if(TAKE_OUT_YN.equalsIgnoreCase("C")) {
            orderCancel.showCancel();
        }
        argMap.put("TAKE_OUT_YN", TAKE_OUT_YN);
        orderInfo.showCurrInfo(MENU_NM, MENU_SIZE_NM, TAKE_OUT_YN_NM);

        System.out.println("�߰��ֹ�Ȯ��");
        orderAdd.showAdd(argMap);

        orderInfo.showInfo();
    }
}
