package edu.mum.cs.inventorymanager.controller.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value={"/login"}, method=RequestMethod.GET)
    public String loginForm() {
        return "homepage/index";
    }

    @RequestMapping(value={"/login"}, method=RequestMethod.POST)
    public String login() {
        return "homepage/index";
    }

}