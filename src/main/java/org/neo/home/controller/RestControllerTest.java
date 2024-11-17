package org.neo.home.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springmvc01
 * @author: neo
 * @create: 2024-11-08 14:11
 **/
@RestController
public class RestControllerTest {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
