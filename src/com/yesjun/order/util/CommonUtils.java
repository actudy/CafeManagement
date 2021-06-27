package com.yesjun.order.util;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtils {
    public static String getDatetimeString() {
        return getDatetimeString("yyyyMMddHHmmss");
    }

    public static String getDatetimeString(String format) {
        Date date = new Date();
        Format formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }
}
