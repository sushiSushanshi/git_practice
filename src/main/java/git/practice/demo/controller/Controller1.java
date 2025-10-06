package git.practice.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test1")
public class Controller1 {
	
	@GetMapping("/one")
	public String test1() {
		System.out.println("added one more change in test 1 in controller branch ");
		return "from cotroller 1";
	}
	@GetMapping("/two")
	public String test2() {
		return "from cotroller 1 and test 2";
	}
}
