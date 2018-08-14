package edu.mum.cs.inventorymanager.controller.ui;

import edu.mum.cs.inventorymanager.model.entity.Merchant;
import edu.mum.cs.inventorymanager.service.contract.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.security.Principal;

@Controller
public class DashboardController {

    @Autowired
    private MerchantService merchantService;

    @RequestMapping(value = {"/dashbaord"}, method = RequestMethod.GET)
    public ModelAndView loginForm(Model model, HttpSession session, Principal principal) {
        ModelAndView modelAndView = new ModelAndView();
        if (principal != null) {
            Merchant merchant = merchantService.findMerchantByUsername(principal == null ? "" : principal.getName());
            session.setAttribute("merchantInfo", merchant);
        }
        modelAndView.setViewName("common/usermasterlayout"); //merchants/dashboard
        modelAndView.addObject(new Merchant());
        return modelAndView;
    }


}
