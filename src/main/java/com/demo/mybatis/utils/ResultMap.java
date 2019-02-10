package com.demo.mybatis.utils;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/*
 * @author wayne
 */
@Getter@Setter
public class ResultMap {

    public String msg = "SUCCESS";

    public int code = 0;

    public Object data;

    public ResultMap(){
    }

    public ResultMap(String msg){
        this.msg = msg;
    }

    public ResultMap(Object data){
        this.data = data;
    }

}
