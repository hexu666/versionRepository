package org.myblog.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController返回json字符串的数据，直接可以编写RESTFul的接口
@RestController
//让spring boot自动给程序进行必要的配置，等价于以默认属性使用
//@Configuration，@EnableAutoConfiguration和@ComponentScan
@SpringBootApplication  
public class ExampleSpringBoot {  
    @RequestMapping("/home")  
    String home() {  
        return "Hello World,oh my god!";  
    }  
      
    public static void main(String[] args) {  
        SpringApplication.run(ExampleSpringBoot.class, args);    
    }  
}
