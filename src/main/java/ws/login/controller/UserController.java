package ws.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("/login")
    @ResponseBody
    public Object login(){
        int i=0;
        int j=0;
        return "success";
    }

}
