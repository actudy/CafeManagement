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

        String MENU_NM = "";     // �޴���
        String TMPRT_CD = "";    // �µ������ڵ�
        String SHOT_CNT = "";    // �� �߰� ��
        String MENU_SIZE = "";   // �޴� ũ��
        String TAKE_OUT_YN = ""; // ����ũ�ƿ� ����
        String MENU_AMT = "";    // �޴��ݾ�

        String TMPRT_CD_NM = "";
        String SHOT_CNT_NM = "";
        String MENU_SIZE_NM = "";
        String TAKE_OUT_YN_NM = "";

        MENU_NM = "�Ƹ޸�ī��";
        MENU_AMT = "1000";
        argMap.put("MENU_NM", MENU_NM);
        argMap.put("MENU_AMT", MENU_AMT);
        System.out.println(MENU_NM);

        TMPRT_CD = scanStr("1.ICE 2.HOT ���� (�ֹ����:C) : ");
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

        SHOT_CNT = scanStr("1.1��(+0��) 2.2��(+500��) ���� (�ֹ����:C) : ");
        if(SHOT_CNT.equalsIgnoreCase("1")) {
            SHOT_CNT_NM = SHOT_CNT + "��";
        } else if(SHOT_CNT.equalsIgnoreCase("2")) {
            SHOT_CNT_NM = SHOT_CNT + "��";
        }
        if(SHOT_CNT.equalsIgnoreCase("C")) {
            orderCancel.showCancel();
        }
        argMap.put("SHOT_CNT", SHOT_CNT);
        orderInfo.showCurrInfo(MENU_NM, TMPRT_CD_NM, SHOT_CNT_NM);

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
        orderInfo.showCurrInfo(MENU_NM, TMPRT_CD_NM, SHOT_CNT_NM, MENU_SIZE_NM);

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
        orderInfo.showCurrInfo(MENU_NM, TMPRT_CD_NM, SHOT_CNT_NM, MENU_SIZE_NM, TAKE_OUT_YN_NM);

        System.out.println("�߰��ֹ�Ȯ��");
        orderAdd.showAdd(argMap);

        orderInfo.showInfo();
    }
}
