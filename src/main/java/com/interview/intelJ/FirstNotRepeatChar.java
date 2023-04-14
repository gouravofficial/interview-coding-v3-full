package com.interview.intelJ;
public class FirstNotRepeatChar {


    public static void main(String[] args) {

        String s="dssfferfhrfsd";


        for (Character c:s.toCharArray()){

            if(s.indexOf(c)==s.lastIndexOf(c)){
                System.out.println("First Repeated Char==>"+c);
                break;
            }
        }

    }
}
