package com.payment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaymentGatewayController {

    @RequestMapping("/paymentPage")
    public String showLoginPage(){
        return "PaymentLogin";
    }
}
