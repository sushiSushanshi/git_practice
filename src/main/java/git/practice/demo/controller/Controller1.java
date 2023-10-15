package git.practice.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test1")
public class Controller1 {
	
	@GetMapping
	public String test1() {
		return "from cotroller 1";
	}
}
