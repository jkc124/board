package www.first.com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
public class Controller {
	@RequestMapping(value = "/request_add", method = RequestMethod.GET)
	public String insert() {
		
		return "/response_form";
		
	}
}