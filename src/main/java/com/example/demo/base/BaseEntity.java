package com.example.demo.base;

import com.example.demo.util.Status;

import java.io.Serializable;

public class BaseEntity<T> implements Serializable {
    private Status status;
    private T data;

    public BaseEntity(Status status, T data) {
        this.status = status;
        this.data = data;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
