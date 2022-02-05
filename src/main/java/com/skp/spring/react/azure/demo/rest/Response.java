package com.skp.spring.react.azure.demo.rest;

import lombok.Data;

import java.util.Date;


public class Response<Data> {
    private Long timestamp = new Date().getTime();
    private String message;
    private String code = "S-APP-1";
    private Data data;

    public Response() {

    }

    public Response(String message, Data data) {
        this.message = message;
        this.data = data;
    }

    public Response(String message, Data data, String code) {
        this.message = message;
        this.data = data;
        this.code = code;
    }


    public Response(String message) {
        this.message = message;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
