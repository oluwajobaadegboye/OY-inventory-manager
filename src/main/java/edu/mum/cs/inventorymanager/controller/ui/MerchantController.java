package edu.mum.cs.inventorymanager.controller.ui;

import edu.mum.cs.inventorymanager.model.entity.Merchant;
import edu.mum.cs.inventorymanager.repository.IMerchantRepository;
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
	private IMerchantRepository merchantRepository;

	@RequestMapping(value={"/merchants/","/merchants/index","/merchants/browse"}, method=RequestMethod.GET)
	public ModelAndView merchants() {
		ModelAndView mav = new ModelAndView();
		List<Merchant> merchants = merchantRepository.findAll();
		mav.addObject("merchants", merchants);
		mav.setViewName("merchants/index");
		return mav;
	}
	
	@RequestMapping(value="/merchants/new", method = RequestMethod.GET)
	public String registrationForm(Model model){
		model.addAttribute("merchant", new Merchant());
		return "merchants/new";
	}
	
	@RequestMapping(value = "/merchants/new", method = RequestMethod.POST)
	public String registerNewStudent(@Valid @ModelAttribute("merchant") Merchant merchant,
                                     BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("errors", bindingResult.getAllErrors());
			return "merchants/new";
		}
		merchant = merchantRepository.save(merchant);
		return "redirect:/merchants/index";
	}
	
	@RequestMapping(value="/merchants/edit/{id}", method = RequestMethod.GET)
	public String editStudent(@PathVariable Long id, Model model){
		Merchant s = merchantRepository.findByMerchantId(id);
		if (s != null) {
			model.addAttribute("merchant", s);
			return "merchants/edit";
		}
		return "merchants/browse";
	}
	
	@RequestMapping(value = "/merchants/edit", method = RequestMethod.POST)
	public String updateStudent(@Valid @ModelAttribute("merchant") Merchant merchant,
                                BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("errors", bindingResult.getAllErrors());
			return "merchants/edit";
		}
		merchant = merchantRepository.save(merchant);
		return "redirect:/merchants/browse";
	}
}
