package com.otto.core.mongo.response;

public class BasicResponse<T> {

    private Integer code;

    private String message;

    private T data;

    public BasicResponse() {
        this.code = 200;
        this.message = "success";
    }

    public BasicResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
