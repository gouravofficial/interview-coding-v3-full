package com.interview.intelJ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterIntegerInStringStream {

    public static void main(String[] args) {


        String str = "5 , 2, 2a, 3,    -14, b55";
        List<Integer> list =  Arrays.stream(str.split(","))
                .map(String::trim)
                .filter(s -> s.matches(""+"-?\\d"+""))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(list);

    }
}
