package com.soa.ws.RestWs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {

    @RequestMapping("/hola")
    public int sayhello() {
        int a=12;
        int b=13;
        int suma= a+b;


        return(suma);
    }
}
