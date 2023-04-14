package com.interview.intelJ;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountChar {


    public static void main(String[] args) {


        String str = "swsdwedf";

        Map<Character,Integer> mapObj=new HashMap<Character,Integer>();
        for(Character c:str.toCharArray()){
            Integer count=mapObj.get(c);
            if(count !=null){
                mapObj.put(c,count+1);
            }else{
                mapObj.put(c,1);
            }
        }
        mapObj.entrySet().forEach(e->{
            System.out.println(e.getKey()+"-"+e.getValue());
        });

    }

}
