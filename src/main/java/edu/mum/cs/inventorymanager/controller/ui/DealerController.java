package edu.mum.cs.inventorymanager.controller.ui;

import edu.mum.cs.inventorymanager.model.entity.Dealer;
import edu.mum.cs.inventorymanager.repository.IDealerRepository;
import edu.mum.cs.inventorymanager.service.contract.DealerService;
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
public class DealerController {

    @Autowired
    private DealerService dealerService;

    @GetMapping(value = {"/dealers", "/dealers/", "/dealers/index"})
    public ModelAndView dealers() {
        ModelAndView modelAndView = new ModelAndView();
        List<Dealer> dealers = dealerService.findAll();
        modelAndView.addObject("dealers", dealers);
        modelAndView.setViewName("dealers/index");
        return modelAndView;
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
        dealerService.save(dealer);
        return "redirect:/dealers/";
    }

    @GetMapping(value="/dealers/edit/{id}")
    public String editMerchant(@PathVariable Long id, Model model) {
        Dealer dealer = dealerService.findOne(id);
        if (dealer != null) {
            model.addAttribute("dealer", dealer);
            return "dealers/edit";
        }
        return "dealers/index";
    }

    @PostMapping(value = "/dealers/edit")
    public String updateMerchant(@Valid @ModelAttribute("dealer") Dealer dealer,
                                 BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "dealers/edit";
        }
        dealerService.save(dealer);
        return "redirect:/dealers/index";
    }
}
