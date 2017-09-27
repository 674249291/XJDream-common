package com.XJDream.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/9/26.
 */
public class Test {

    public static void  main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        //FIXME
        for (String item : list) {
            if ("2".equals(item)) {
                list.remove(item);
            }
        }
        System.out.print(list.toString());
    }
}
