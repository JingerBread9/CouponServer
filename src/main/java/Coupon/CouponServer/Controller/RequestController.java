package Coupon.CouponServer.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @PostMapping (value = "/test")
    public String test (@RequestParam("name") String name) {

        System.out.println("/test Requested ....");

        return "TEST SERVER RUNNING. You are free to use this server. "+name;

    }
}
