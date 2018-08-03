package edu.mum.cs.inventorymanager.controller.ui;

import edu.mum.cs.inventorymanager.model.Salesman;
import edu.mum.cs.inventorymanager.service.contract.SalespersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
public class SalespersonController {

    @Autowired
    private SalespersonService salespersonService;

    @GetMapping(value={"/salespersons/", "/salespersons/index"})
    public ModelAndView salespersons() {
        ModelAndView mav = new ModelAndView();
        List<Salesman> salespersons = salespersonService.findAll();
        mav.addObject("salespersons", salespersons);
        mav.setViewName("salespersons/index");
        return mav;
    }

    @GetMapping(value="/salespersons/new")
    public String createSalespersonForm(Model model){
        model.addAttribute("salesperson", new Salesman());
        return "salespersons/new";
    }

    @PostMapping(value = "/salespersons/new")
    public String registerNewSalesperson(@Valid @ModelAttribute("salesperson") Salesman salesperson,
                                      BindingResult bindingResult, Model model, HttpServletRequest request) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "merchants/new";
        }
        salespersonService.create(salesperson);
        return "redirect:/salespersons/index";
    }

//    @GetMapping(value="/salespersons/edit/{id}")
//    public String editSalesperson(@PathVariable Long id, Model model){
//        Salesman s = salespersonService.findById(id);
//        if (s != null) {
//            model.addAttribute("salesperson", s);
//            return "salespersons/edit";
//        }
//        return "salespersons/edit";
//    }
//
//    @PostMapping(value = "/salespersons/edit")
//    public String updateSalesperson(@Valid @ModelAttribute("salesman") Salesman salesperson,
//                                 BindingResult bindingResult, Model model) {
//        if (bindingResult.hasErrors()) {
//            model.addAttribute("errors", bindingResult.getAllErrors());
//            return "salespersons/edit";
//        }
////        salespersons = salespersons().update(salespersons);
//        return "redirect:/salespersons/edit";
//    }
}
