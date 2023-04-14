package com.interview.intelJ;
import java.util.HashSet;
import java.util.Set;

public class IsogramCheck {

    public static void main(String[] args) {

        String str="hello";
        char ch[]=str.toCharArray();

        Set<Character> setObj=new HashSet<>();
        for (char c:ch){

            if(setObj.contains(c)){

                System.out.println("Word is not isogram");
                return;
            }else{
                setObj.add(c);
            }
        }






    }
}
