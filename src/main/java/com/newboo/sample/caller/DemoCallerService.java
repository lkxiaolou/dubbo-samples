package com.newboo.sample.caller;

import com.newboo.sample.api.DemoService;
import com.newboo.sample.api.Req;
import com.newboo.sample.api.Resp;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoCallerService {

    @DubboReference(scope = "remote", check = false, version = "1.0.0", group = "read")
    private DemoService demoService;

    @GetMapping(path = "/hello")
    public Resp call() {
        Req req = new Req();
        req.setCaller("lk");
        Resp resp = demoService.sayHello(req);
        System.out.println("call rt = " + resp.getMsg());
        return resp;
    }

}
