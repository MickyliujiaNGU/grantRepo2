package com.kingstar.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date parse = simpleDateFormat.parse("1993年09月23日 08时08分08秒");
        long l = System.currentTimeMillis() - parse.getTime();
        System.out.println(l/68400000);

    }
}
