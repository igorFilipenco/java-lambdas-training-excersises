package com.lambda.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(getMaxLoweCaseString(Arrays.asList(
                "hey",
                "kawabunga",
                "great"
                )));
    }

    private static String getMaxLoweCaseString(List<String> strings) {
        return strings.stream()
                .max(Comparator.comparingInt(Task6::getLowerCaseLettersCountFromString)).get();
    }
}
