package com.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webapp.entity.Registration;
import com.webapp.service.registrationService;

@Controller
public class RegistrationController {
    @Autowired
	private registrationService regservice;
	//http://localhost:8080/view-registration-page
	@RequestMapping("/view-registration-page")
	public String viewRegistration() {
		return "new_reg";
	}
	@RequestMapping("/saveReg")
	public String saveRegistration(
			@RequestParam("firstName") String fname,
			@RequestParam("lastName") String lname,
			@RequestParam("email") String email,
			@RequestParam("mobile") long mobile,
			ModelMap model
			) {
		Registration reg = new Registration();
		reg.setFirstname(fname);
		reg.setLastname(lname);
		reg.setEmail(email);
		reg.setMobile(mobile);
		regservice.saveRegistration(reg);
		model.addAttribute("msg","record is saved!!");
		return "new_reg";
	}
}
