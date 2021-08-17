package com.newboo.sample.impl;

import com.newboo.sample.api.DemoService;
import com.newboo.sample.api.Req;
import com.newboo.sample.api.Resp;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0.0", group = "read")
public class DemoServiceImpl implements DemoService {

    @Override
    public Resp sayHello(Req req) {
        Resp resp = new Resp();
        resp.setMsg("hello" + req.getCaller());
        System.out.println(resp.getMsg());
        return resp;
    }
}
