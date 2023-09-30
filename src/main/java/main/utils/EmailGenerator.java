package main.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class EmailGenerator {

    public static String getEmail(String domain) {

        return RandomStringUtils.randomAlphabetic(5).toLowerCase() + "@" + domain;
    }
}
