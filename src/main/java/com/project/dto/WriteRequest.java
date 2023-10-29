package com.project.dto;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;

@Introspected
@Serdeable
public class WriteRequest {
    private Integer userId;
    private Object data;

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "WriteRequest{" +
                "userId=" + userId +
                ", data=" + data +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public Object getData() {
        return data;
    }
}
