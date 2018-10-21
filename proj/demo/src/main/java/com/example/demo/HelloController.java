package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 *
 *
 */

@RestController
public class HelloController {

    @Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String content;

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = {"/hello","/hi"}, method = RequestMethod.GET)
    public String say(){
            return //cupSize + age + "<br/>" + content;
            girlProperties.getCupSize();
        }

    @RequestMapping(value = {"/bye/{id}"}, method = RequestMethod.GET)
    public String bye(@PathVariable("id") Integer id){
        return "id:" + id;
    }

    @RequestMapping(value = {"/{id}/bye"}, method = RequestMethod.GET)
    public String bye1(@PathVariable("id") Integer id){
        return "id:" + id;
    }

    // url: /bye_?id=200
    @RequestMapping(value = {"/bye_"}, method = RequestMethod.GET)
    public String bye3(@RequestParam("id") Integer id){
        return "id:" + id;
    }

    // url: /bye_?id=200
    @RequestMapping(value = {"/bye__"}, method = RequestMethod.GET)
    public String bye4(@RequestParam(value = "id",
            required = false,defaultValue = "0") Integer id){
        return "id:" + id;
    }

    // url: /bye_?id=200
    @GetMapping(value = {"/bye_gm_"}) //组合注解
    public String bye5(@RequestParam(value = "id",
            required = false,defaultValue = "0") Integer id){
        return "id:" + id;
    }



}
