package com.yesjun.order.view.pop;

import com.yesjun.order.util.CommonUtils;
import com.yesjun.order.view.OrderVw;

import java.util.*;

public class OrderInfo extends OrderVw {
    @Override
    public void process() throws Exception {
        // TODO
    }

    public void showCurrInfo(String MENU_NM, String... status) {
        String prnStr = MENU_NM;
        prnStr += "(";
        for(int i = 0; i < status.length; i++) {
            prnStr += status[i];
            if(i < status.length - 1) {
                prnStr += "/";
            }
        }
        prnStr += ")";
        System.out.println(prnStr);
    }

    public void showInfo() throws Exception {
        ArrayList<HashMap<String, String>> retList = orderService.select();
        System.out.println("\n�ֹ��Ϸ�");
        System.out.println("==============================");
        System.out.println("   �ֹ���ȣ : " + CommonUtils.getDatetimeString());
        System.out.println("==============================");
        System.out.println("ǰ��\t\t����\t\t�ݾ�");
        System.out.println("------------------------------");

        ArrayList<HashMap<String, String>> infoList = new ArrayList<>();
        HashMap<String, String> infoMap = null;

        for(HashMap<String, String> ret : retList) {
            String MENU_NM = ret.get("MENU_NM");
            String MENU_AMT = ret.get("MENU_AMT");

            String TMPRT_CD = "";
            if(ret.get("TMPRT_CD") != null) {
                TMPRT_CD = ret.get("TMPRT_CD");
            }
            String SHOT_CNT = "";
            if(ret.get("SHOT_CNT") != null) {
                SHOT_CNT = ret.get("SHOT_CNT");
            }

            String MENU_SIZE = ret.get("MENU_SIZE");
            String TAKE_OUT_YN = ret.get("TAKE_OUT_YN");

            String TMPRT_CD_NM = "";
            String SHOT_CNT_NM = "";
            String MENU_SIZE_NM = "";
            String TAKE_OUT_YN_NM = "";

            String TMPRT_CD_AMT = "";
            String SHOT_CNT_AMT = "";
            String MENU_SIZE_AMT = "";
            String TAKE_OUT_YN_AMT = "";

            String SUM_AMT = "";

            if(TMPRT_CD.equalsIgnoreCase("1")) {
                TMPRT_CD_NM = "ICE";
                TMPRT_CD_AMT = "0";
            } else if(TMPRT_CD.equalsIgnoreCase("2")) {
                TMPRT_CD_NM = "HOT";
                TMPRT_CD_AMT = "0";
            }
            if(SHOT_CNT.equalsIgnoreCase("1")) {
                SHOT_CNT_NM = SHOT_CNT + "��";
                SHOT_CNT_AMT = "0";
            } else if(SHOT_CNT.equalsIgnoreCase("2")) {
                SHOT_CNT_NM = SHOT_CNT + "��";
                SHOT_CNT_AMT = "500";
            }
            if(MENU_SIZE.equalsIgnoreCase("1")) {
                MENU_SIZE_NM = "S" + "������";
                MENU_SIZE_AMT = "0";
            } else if(MENU_SIZE.equalsIgnoreCase("2")) {
                MENU_SIZE_NM = "M" + "������";
                MENU_SIZE_AMT = "500";
            } else if(MENU_SIZE.equalsIgnoreCase("3")) {
                MENU_SIZE_NM = "L" + "������";
                MENU_SIZE_AMT = "1000";
            }
            if(TAKE_OUT_YN.equalsIgnoreCase("1")) {
                TAKE_OUT_YN_NM = "�����̿�";
                TAKE_OUT_YN_AMT = "500";
            } else if(TAKE_OUT_YN.equalsIgnoreCase("2")) {
                TAKE_OUT_YN_NM = "����ũ�ƿ�";
                TAKE_OUT_YN_AMT = "0";
            }

            infoMap = new HashMap<>();
            switch (MENU_NM) {
                case "�Ƹ޸�ī��":
                    infoMap.put("MENU_NM", MENU_NM);
                    infoMap.put("TMPRT_CD_NM", TMPRT_CD_NM);
                    infoMap.put("SHOT_CNT_NM", SHOT_CNT_NM);
                    infoMap.put("MENU_SIZE_NM", MENU_SIZE_NM);
                    infoMap.put("TAKE_OUT_YN_NM", TAKE_OUT_YN_NM);

                    infoMap.put("MENU_AMT", MENU_AMT);
                    infoMap.put("TMPRT_CD_AMT", TMPRT_CD_AMT);
                    infoMap.put("SHOT_CNT_AMT", SHOT_CNT_AMT);
                    infoMap.put("MENU_SIZE_AMT", MENU_SIZE_AMT);
                    infoMap.put("TAKE_OUT_YN_AMT", TAKE_OUT_YN_AMT);

                    SUM_AMT = Integer.parseInt(MENU_AMT)
                            + Integer.parseInt(TMPRT_CD_AMT)
                            + Integer.parseInt(SHOT_CNT_AMT)
                            + Integer.parseInt(MENU_SIZE_AMT)
                            + Integer.parseInt(TAKE_OUT_YN_AMT) + "";
                    infoMap.put("SUM_AMT", SUM_AMT);
                    infoList.add(infoMap);
                    break;
                case "�ٴҶ��":
                    infoMap.put("MENU_NM", MENU_NM);
                    infoMap.put("TMPRT_CD_NM", TMPRT_CD_NM);
                    infoMap.put("SHOT_CNT_NM", SHOT_CNT_NM);
                    infoMap.put("MENU_SIZE_NM", MENU_SIZE_NM);
                    infoMap.put("TAKE_OUT_YN_NM", TAKE_OUT_YN_NM);

                    infoMap.put("MENU_AMT", MENU_AMT);
                    infoMap.put("TMPRT_CD_AMT", TMPRT_CD_AMT);
                    infoMap.put("SHOT_CNT_AMT", SHOT_CNT_AMT);
                    infoMap.put("MENU_SIZE_AMT", MENU_SIZE_AMT);
                    infoMap.put("TAKE_OUT_YN_AMT", TAKE_OUT_YN_AMT);

                    SUM_AMT = Integer.parseInt(MENU_AMT)
                            + Integer.parseInt(TMPRT_CD_AMT)
                            + Integer.parseInt(SHOT_CNT_AMT)
                            + Integer.parseInt(MENU_SIZE_AMT)
                            + Integer.parseInt(TAKE_OUT_YN_AMT) + "";
                    infoMap.put("SUM_AMT", SUM_AMT);
                    infoList.add(infoMap);
                    break;
                case "�����̵�":
                    infoMap.put("MENU_NM", MENU_NM);
                    infoMap.put("MENU_SIZE_NM", MENU_SIZE_NM);
                    infoMap.put("TAKE_OUT_YN_NM", TAKE_OUT_YN_NM);

                    infoMap.put("MENU_AMT", MENU_AMT);
                    infoMap.put("MENU_SIZE_AMT", MENU_SIZE_AMT);
                    infoMap.put("TAKE_OUT_YN_AMT", TAKE_OUT_YN_AMT);

                    SUM_AMT = Integer.parseInt(MENU_AMT)
                            + Integer.parseInt(MENU_SIZE_AMT)
                            + Integer.parseInt(TAKE_OUT_YN_AMT) + "";
                    infoMap.put("SUM_AMT", SUM_AMT);
                    infoList.add(infoMap);
                    break;
                case "�ڸ����̵�":
                    infoMap.put("MENU_NM", MENU_NM);
                    infoMap.put("MENU_SIZE_NM", MENU_SIZE_NM);
                    infoMap.put("TAKE_OUT_YN_NM", TAKE_OUT_YN_NM);

                    infoMap.put("MENU_AMT", MENU_AMT);
                    infoMap.put("MENU_SIZE_AMT", MENU_SIZE_AMT);
                    infoMap.put("TAKE_OUT_YN_AMT", TAKE_OUT_YN_AMT);

                    SUM_AMT = Integer.parseInt(MENU_AMT)
                            + Integer.parseInt(MENU_SIZE_AMT)
                            + Integer.parseInt(TAKE_OUT_YN_AMT) + "";
                    infoMap.put("SUM_AMT", SUM_AMT);
                    infoList.add(infoMap);
                    break;
                case "�����ֽ�":
                    infoMap.put("MENU_NM", MENU_NM);
                    infoMap.put("MENU_SIZE_NM", MENU_SIZE_NM);
                    infoMap.put("TAKE_OUT_YN_NM", TAKE_OUT_YN_NM);

                    infoMap.put("MENU_AMT", MENU_AMT);
                    infoMap.put("MENU_SIZE_AMT", MENU_SIZE_AMT);
                    infoMap.put("TAKE_OUT_YN_AMT", TAKE_OUT_YN_AMT);

                    SUM_AMT = Integer.parseInt(MENU_AMT)
                            + Integer.parseInt(MENU_SIZE_AMT)
                            + Integer.parseInt(TAKE_OUT_YN_AMT) + "";
                    infoMap.put("SUM_AMT", SUM_AMT);
                    infoList.add(infoMap);
                    break;
                case "�丶���ֽ�":
                    infoMap.put("MENU_NM", MENU_NM);
                    infoMap.put("MENU_SIZE_NM", MENU_SIZE_NM);
                    infoMap.put("TAKE_OUT_YN_NM", TAKE_OUT_YN_NM);

                    infoMap.put("MENU_AMT", MENU_AMT);
                    infoMap.put("MENU_SIZE_AMT", MENU_SIZE_AMT);
                    infoMap.put("TAKE_OUT_YN_AMT", TAKE_OUT_YN_AMT);

                    SUM_AMT = Integer.parseInt(MENU_AMT)
                            + Integer.parseInt(MENU_SIZE_AMT)
                            + Integer.parseInt(TAKE_OUT_YN_AMT) + "";
                    infoMap.put("SUM_AMT", SUM_AMT);
                    infoList.add(infoMap);
                    break;
                default:
            }
        }

        String TOT_AMT = "0";
        for(HashMap<String, String> info : infoList) {
            if(info.get("MENU_NM") != null) {
                System.out.println(info.get("MENU_NM") + "\t" + "1" + "\t" + info.get("MENU_AMT"));
                if(info.get("TMPRT_CD_NM") != null && info.get("SHOT_CNT_NM") != null) {
                    System.out.println(" ���߰� " + info.get("TMPRT_CD_NM") + "\t" + "1" + "\t" + info.get("TMPRT_CD_AMT"));
                    System.out.println(" ���߰� " + info.get("SHOT_CNT_NM") + "\t" + "1" + "\t" + info.get("SHOT_CNT_AMT"));
                }
                System.out.println(" ���߰� " + info.get("MENU_SIZE_NM") + "\t" + "1" + "\t" + info.get("MENU_SIZE_AMT"));
                System.out.println(" ���߰� " + info.get("TAKE_OUT_YN_NM") + "\t" + "1" + "\t" + info.get("TAKE_OUT_YN_AMT"));
                TOT_AMT = (Integer.parseInt(TOT_AMT) + Integer.parseInt(info.get("SUM_AMT"))) + "";
            }
        }

        System.out.println("------------------------------");
        System.out.println("�� �� : " + "\t\t\t\t" + TOT_AMT);
        System.out.println("==============================");

        orderService.clear();
    }
}
