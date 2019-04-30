package com.osf.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.osf.web.service.AddrService;

@Controller
public class AddrController {
	
	@Autowired
	private AddrService as;
	
	@RequestMapping(value = "/addr/list",method=RequestMethod.GET)
	public String goAddrList(Model m) {
		m.addAttribute("addrList", as.selectAddrList());
		return "/addr/list";
	}

}
