package com.l2h.eam.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
        model.addAttribute("content","alone");

		return "hello";
	}
    @RequestMapping(method = RequestMethod.GET,path = "/l2h/{name}/{age}")
    String pathTest(ModelMap modelMap,  @PathVariable String name,@PathVariable int age){
        modelMap.addAttribute("name",name);
        modelMap.addAttribute("age",age);
        return "pathTest";
    }
}