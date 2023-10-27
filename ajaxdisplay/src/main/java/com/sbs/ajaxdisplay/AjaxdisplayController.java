package com.sbs.ajaxdisplay;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AjaxdisplayController {

	@GetMapping("/main1")
	public String showMain(){
		return "main1";
	}

}
