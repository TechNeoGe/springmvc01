package org.aniu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springmvc01
 * @author: neo
 * @create: 2024-11-08 14:11
 **/
@RestController
public class RestControllerTest {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
