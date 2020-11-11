package com.zenith.springtest.service;

import org.junit.jupiter.api.Test;

import java.time.*;

public class LocalDateTimeTest {
    @Test
    public void test(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println("当前时间："+now);

        LocalDate localDate = now.toLocalDate();
        System.out.println( "localDate:"+localDate);

        int year = now.getYear();
        Month month = now.getMonth();
        int dayOfMonth = now.getDayOfMonth();
        int second = now.getSecond();
        System.out.println("年:"+year+"月:"+month+"日："+dayOfMonth+"秒："+second);

        //根据当前日期生成新的LocalDateTime
        LocalDateTime localDateTime = now.withDayOfMonth(10).withYear(2020);
        System.out.println(localDateTime);

        LocalDateTime of = LocalDateTime.of(2020, Month.FEBRUARY, 12,12,56);
        System.out.println(of);
        //解析字符串
        LocalTime parse = LocalTime.parse("12:44:23");
        System.out.println(parse);

    }

    @Test
    //使用时区的日期时间API
    public void test2(){
        ZonedDateTime parse = ZonedDateTime.parse("2015-12-03T10:15:30+05:30[Asia/Shanghai]");
        System.out.println(parse);

        ZoneId of = ZoneId.of("Europe/Paris");
        System.out.println(of);

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
    }
}
