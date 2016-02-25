package com.intelligentEarthquake.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by FLY on 2016/2/18 0018.
 */

@Controller
public class IndexController {

    @RequestMapping({"/","/home"})
    public String showIndex(Map<String, Object> model){
        System.out.println("123");
        return "home";
    }

}
