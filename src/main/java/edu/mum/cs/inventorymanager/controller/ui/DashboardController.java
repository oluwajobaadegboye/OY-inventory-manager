package edu.mum.cs.inventorymanager.controller.ui;

import edu.mum.cs.inventorymanager.model.UserType;
import edu.mum.cs.inventorymanager.model.entity.Merchant;
import edu.mum.cs.inventorymanager.model.page.Login;
import edu.mum.cs.inventorymanager.service.contract.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.security.Principal;

@Controller
@RequestMapping("/dashbaord")
public class DashboardController {

    @Autowired
    private MerchantService merchantService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView loginForm(Model model, HttpSession session, Principal principal) throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        Merchant merchant = new Merchant();
        if (principal != null) {
            merchant = merchantService.findMerchantByUsername(principal == null ? "" : principal.getName());
            session.setAttribute("merchantInfo", merchant);
            modelAndView.addObject(merchant);
            if (UserType.MERCHANT.getType().equals(merchant.getUser().getUserType())) {
                modelAndView.setViewName("users/merchant/dashboard");
            } else if (UserType.SALESPERON.getType().equals(merchant.getUser().getUserType())) {
                modelAndView.setViewName("users/saler/salerIndex");
            }
        }  else {
            model.addAttribute("login", new Login());
            modelAndView.setViewName("common/login");
        }

        return modelAndView;
    }


}
