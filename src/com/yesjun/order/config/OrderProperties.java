package com.yesjun.order.config;

public class OrderProperties {
    private static final String prefix = "com.yesjun.order.view";

    final String[] keys = {
            "CFA001",
            "CFA002",
            "CFB001",
            "CFB002",
            "CFC001",
            "CFC002"
    };
    final String[] values = {
            prefix + ".CF.A.CFA001",
            prefix + ".CF.A.CFA002",
            prefix + ".CF.B.CFB001",
            prefix + ".CF.B.CFB002",
            prefix + ".CF.C.CFC001",
            prefix + ".CF.C.CFC002"
    };

    public int size() {
        return keys.length;
    }

    public String[] keys() {
        return keys;
    }

    public String get(String key) {
        return values[getIndexByKey(key)];
    }

    private int getIndexByKey(String key) {
        for(int i = 0; i < keys.length; ++i) {
            if(keys[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
}
