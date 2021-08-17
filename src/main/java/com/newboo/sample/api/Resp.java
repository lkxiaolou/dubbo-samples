package com.newboo.sample.api;

import java.io.Serializable;

public class Resp implements Serializable {
    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
