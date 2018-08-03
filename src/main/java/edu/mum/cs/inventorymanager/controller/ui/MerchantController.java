package edu.mum.cs.inventorymanager.controller.ui;

import edu.mum.cs.inventorymanager.model.entity.Merchant;
import edu.mum.cs.inventorymanager.service.contract.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.validation.Valid;
import java.util.List;

@Controller
public class MerchantController {

	@Autowired
	private MerchantService merchantService;

	@RequestMapping(value={"/merchants/","/merchants/index","/merchants/browse"}, method=RequestMethod.GET)
	public ModelAndView merchants() {
		ModelAndView mav = new ModelAndView();
		List<Merchant> merchants = merchantService.findAll();
		mav.addObject("merchants", merchants);
		mav.setViewName("merchants/index");
		return mav;
	}
	
	@RequestMapping(value="/merchants/new", method = RequestMethod.GET)
	public String createMerchantForm(Model model){
		model.addAttribute("merchant", new Merchant());
		return "merchants/new";
	}
	
	@RequestMapping(value = "/merchants/new", method = RequestMethod.POST)
	public String registerNewMerchant(@Valid @ModelAttribute("merchant") Merchant merchant,
                                     BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("errors", bindingResult.getAllErrors());
			return "merchants/new";
		}
		merchant = merchantService.create(merchant);
		return "redirect:/login";
	}
	
	@RequestMapping(value="/merchants/edit/{id}", method = RequestMethod.GET)
	public String editMerchant(@PathVariable Long id, Model model){
		Merchant s = merchantService.findById(id);
		if (s != null) {
			model.addAttribute("merchant", s);
			return "merchants/edit";
		}
		return "merchants/dashboard";
	}
	
	@RequestMapping(value = "/merchants/edit", method = RequestMethod.POST)
	public String updateMerchant(@Valid @ModelAttribute("merchant") Merchant merchant,
                                BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("errors", bindingResult.getAllErrors());
			return "merchants/edit";
		}
		merchant = merchantService.update(merchant);
		return "redirect:/merchants/dashboard";
	}
}
