package edu.mum.cs.inventorymanager.controller.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomepageController {

	@RequestMapping(value={"/home","/","/index",""}, method=RequestMethod.GET)
	public String homepage() {
		return "users/merchant/merchantIndex";
	}


	@RequestMapping(value={"/saler"}, method=RequestMethod.GET)
	public String salerlayout() {
		return "users/saler/salerIndex";
	}

	@RequestMapping(value={"/new"}, method=RequestMethod.GET)
	public String userlayout() {
		return "common/usermasterlayout";
	}


	@RequestMapping(value={"/edit"}, method=RequestMethod.GET)
	public String userplayout() {
		return "products/new";
	}
}