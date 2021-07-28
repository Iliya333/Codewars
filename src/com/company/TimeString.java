package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Метод выводит день недели из даты
 * и так же идет проверка на  времени работы мметода
 */
public class TimeString {
    public static void main(String[] args) throws ParseException {
        long startTime = System.currentTimeMillis();

        String input_data =  "28/07/2021";
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = format.parse(input_data);
        DateFormat format1 = new SimpleDateFormat("EEEE");
        String finaliDay = format1.format(date1);
        System.out.println(finaliDay);

        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime-startTime) + "ms");



    }
}
