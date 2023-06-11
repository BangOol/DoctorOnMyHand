package com.project.doctoronmyhand.controller;


import com.project.doctoronmyhand.memberDTO.MemberDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping(value ="/hello")
    public String hello() {
        return "Hello World";
    }

    // http://localhost:8080/api/v1/get-api/request?keyt1=value1&key2=value2
    @GetMapping(value = "/request")
    public String helloTest(@RequestParam Map<String, String> param){

        StringBuilder sb = new StringBuilder();

        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }

    @GetMapping(value = "/request2")
    public String helloTest2(@RequestParam MemberDTO memberDTO){
        return memberDTO.getMember();
    }


}
