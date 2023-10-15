package git.practice.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller2 {
	
	@GetMapping("/one")
	public String test2() {
		return "from cotroller 2";
	}
	@GetMapping("/two")
	public String test3() {
		return "from cotroller 2 and method 2";
	}
}
