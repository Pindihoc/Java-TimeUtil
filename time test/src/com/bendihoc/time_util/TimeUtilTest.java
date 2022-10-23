package com.bendihoc.time_util;

import java.time.*;

public class TimeUtilTest {
    public static void main(String[] args) {
        /*
        * when you work with an app that has users at various timezone
        * the database usually sets the time zone at UTC/GMT which is +00:00
        * so when we receive time data from DB, we need to convert data to user's time zone
        * before giving  it back to frontend to display to client
        * DATETIME in DB -> LocalDateTime in Java
        * TIME in DB -> LocalTime in Java
        * */
        //2022-10-23T09:05:58.593010900
        System.out.println(Instant.now());
        LocalDateTime localDateTime = TimeUtil.convertUtcToLocalDateTime(LocalDateTime.parse("2022-10-23T09:05:58.593010900"),"+07:00");
        System.out.println(localDateTime);
        LocalTime localTime = TimeUtil.convertUtcToLocalTime(LocalTime.parse("09:05:58.593010900"),"+07:00");
        System.out.println(localTime);
    }
}
