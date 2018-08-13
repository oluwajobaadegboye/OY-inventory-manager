package edu.mum.cs.inventorymanager.controller.ui;


import edu.mum.cs.inventorymanager.model.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {



    @GetMapping(value = "/dashboard" )
    public String report(Model model) {
        model.addAttribute("product", new Product());
        return "users/merchant/dashboard";
    }
//
//    @RequestMapping(value={"/dashbaord"}, method=RequestMethod.GET)
//    public ModelAndView loginForm(Model model, HttpServletRequest request) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("users/merchant/dashboard");//merchants/dashboard
//        modelAndView.addObject(new Merchant());
//        return modelAndView;
//    }

}
