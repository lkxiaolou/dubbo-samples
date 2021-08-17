package com.newboo.sample.api;

import java.io.Serializable;

public class Req implements Serializable {
    String caller;

    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }
}
