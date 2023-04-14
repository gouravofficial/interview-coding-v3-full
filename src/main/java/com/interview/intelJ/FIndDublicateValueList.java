package com.interview.intelJ;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FIndDublicateValueList {

    public static void main(String[] args) {

        List<Integer> orignalList= Arrays.asList(10,1,1,2,5,2,4,3,4,2);

     List<Integer>  filteList=  orignalList.stream().distinct().filter(e ->
             Collections.frequency(orignalList ,e) >1).collect(Collectors.toList());
             System.out.println(filteList);
    }
}
