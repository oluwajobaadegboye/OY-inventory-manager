package edu.mum.cs.inventorymanager.controller.ui;

import edu.mum.cs.inventorymanager.model.entity.Merchant;
import edu.mum.cs.inventorymanager.model.page.Login;
import edu.mum.cs.inventorymanager.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class LoginController {

    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String loginForm(Model model) {
        model.addAttribute("login", new Login());
        return "common/login";
    }

    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public String login(@Valid @ModelAttribute("login") Login login,
                        BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "common/login";
        }
        Merchant merchant = loginService.login(login);
        if (merchant != null) {
            return "redirect:/dashbaord";
        } else {
            return "redirect:/login";
        }
    }

}
