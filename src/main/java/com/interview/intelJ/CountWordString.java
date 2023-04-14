package com.interview.intelJ;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordString {

    public static void main(String[] args) {

        String str="welcome to the java to the welcome";

        List<String> orginalList= Arrays.asList(str.split(" "));

      Map<String,Long> mapObj=orginalList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
              System.out.println(mapObj);

    }
}
