package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 炜 on 2017/5/17.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        System.out.println("*****SchedualServiceHiHystric"+name);
        return "erro" + name;
    }
}
