package com.krishantha.rentcloud.configconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.krishantha.rentcloud.configconsumer.model.MemberProfileConfiguration;

@Controller
public class ProfileController {

	@Autowired
	MemberProfileConfiguration memberProfileConfiguration;
	
	@RequestMapping("/profile")
	public String getConfig(Model model) {
		
		model.addAttribute("model", memberProfileConfiguration.getDefaultModel());
		model.addAttribute("min", memberProfileConfiguration.getMinRentPeriod());
		return "mprofile";
		//return memberProfileConfiguration;
	}
}
