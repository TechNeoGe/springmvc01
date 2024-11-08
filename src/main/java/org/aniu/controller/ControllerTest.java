package org.aniu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: springmvc01
 * @author: neo
 * @create: 2024-11-07 22:19
 **/
@Controller
public class ControllerTest {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
