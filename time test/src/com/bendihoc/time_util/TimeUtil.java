package com.bendihoc.time_util;

import java.time.*;

public class TimeUtil {
    /*
    * This method take DATETIME data return form database that has timezone at UTC/GMT
    * then convert it to client's timezone
    * ZoneOffset in format: "+07:00"
    */
    public static LocalDateTime convertUtcToLocalDateTime(LocalDateTime utcDateTime, String zoneOffset){
        LocalDateTime result = Instant.parse(utcDateTime.atZone(ZoneOffset.UTC).toString())
                .atZone(ZoneId.of(zoneOffset))
                .toLocalDateTime();
        return result;
    }

    /*
    * This method take TIME data return form database that has timezone at UTC/GMT
    * then convert it to client's timezone
    * ZoneOffset in format: "+07:00"
    */
    public static LocalTime convertUtcToLocalTime(LocalTime utcTime, String zoneOffset){
        LocalTime result =  utcTime.atOffset(ZoneOffset.UTC)
                .withOffsetSameInstant(ZoneOffset.of(zoneOffset))
                .toLocalTime();
        return result;
    }
}
