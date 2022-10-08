package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    // Routing on /hello
    @RequestMapping("/hello")
    String index(){
        return "index";
    }
}
