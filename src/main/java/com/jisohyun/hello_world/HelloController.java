package com.jisohyun.hello_world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public void hello(HttpServletResponse response) throws IOException{
        response.getWriter().print("HELLO WORLD");
    }
}
