package com.demo.mybatis.utils;

import java.util.Map;

public class Maputils {
    public static String getString(Map<String,Object> map, String name){
        if(map.containsKey(name)){
            return String.valueOf(map.get(name));
        }
        return "";
    }

    public static Long getLong(Map<String,Object> map, String name){
        if(map.containsKey(name)){
            return Long.parseLong(String.valueOf(map.get(name)));
        }
        return null;
    }

    public static Integer getInt(Map<String,Object> map, String name){
        if(map.containsKey(name)){
            return Integer.parseInt(String.valueOf(map.get(name)));
        }
        return null;
    }

}
