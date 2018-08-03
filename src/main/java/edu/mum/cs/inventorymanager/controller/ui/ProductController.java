package edu.mum.cs.inventorymanager.controller.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {

    @RequestMapping(value={"/merchants/","/merchants/index","/merchants/browse"}, method=RequestMethod.GET)
    public ModelAndView merchants() {
        ModelAndView mav = new ModelAndView();
//        List<Merchant> merchants = merchantService.findAll();
        mav.addObject("merchants", null);
        mav.setViewName("products/index");
        return mav;
    }
}
