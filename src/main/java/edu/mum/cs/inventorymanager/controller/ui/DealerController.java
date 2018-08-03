package edu.mum.cs.inventorymanager.controller.ui;

import edu.mum.cs.inventorymanager.model.Dealer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class DealerController {

    @GetMapping(value = {"/dealers/", "/dealers/index"})
    public ModelAndView dealers() {
        ModelAndView mav = new ModelAndView();
        // pass dealers to ModelAndView
        mav.setViewName("dealers/index");
        return mav;
    }

    @GetMapping(value = "dealers/new")
    public String createDealer(Model model) {
        model.addAttribute("dealer", new Dealer());
        return "dealers/new";
    }

    @PostMapping(value = "/dealers/new")
    public String registerNewDealer(@Valid @ModelAttribute("dealer") Dealer dealer,
                                    BindingResult bindingResult, Model model, HttpServletRequest request) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "dealer/new";
        }
        return "redirect:/login";
    }
}
