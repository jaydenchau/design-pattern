package com.nature.park.client;

import java.util.Map;

/**
 * @author Jayden Chau
 * @date 2023/4/10 22:33
 */
public class ParkResult {

    private Integer code;

    private Map<String, Object> data;

    private String message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ParkResult{" +
               "code=" + code +
               ", data=" + data +
               ", message='" + message + '\'' +
               '}';
    }
}
