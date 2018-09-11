package com.test.testDesignPattern.singleton;

import java.lang.reflect.Constructor;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-27-20:32
 */
public class Test {
    public static void main(String[] args) {
        String date = new SimpleDateFormat("HHmmssSSSd").format(new Date());
        System.out.println(date);
    }
}
