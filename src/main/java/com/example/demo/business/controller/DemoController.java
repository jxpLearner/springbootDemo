package com.example.demo.business.controller;

import com.example.demo.business.domain.Demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DemoController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @PostMapping("/check")
    @ResponseBody
    public Map<String, String> check(@Valid Demo demo, BindingResult bindingResult) {
        Map<String, String> map = new HashMap<>();
        if (bindingResult.hasErrors()) {
            map.put("status", "error");
        } else {
            System.out.println(demo.getName());
            map.put("status", "success");
        }
        return map;
    }
}
