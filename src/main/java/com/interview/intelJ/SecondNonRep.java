package com.interview.intelJ;
public class SecondNonRep {

    public static void main(String[] args) {

        String str="aabcddggg";
        int count=0;
        for (Character c:str.toCharArray()){

            if(str.indexOf(c)==str.lastIndexOf(c)){
                if(count==1){
                    System.out.println("First Repeated Char==>"+c);
                    break;
                }
                count=1;

            }
        }
    }

}
