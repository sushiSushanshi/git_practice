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

	@GetMapping("/three")
	public String test3() {
		System.out.println("added one more log change in test 3 ");
		System.out.println("added one more change in test 3 ");
		System.out.println("added one more change in test 3 ");
		System.out.println("two");
		System.out.println("three");
		System.out.println("four");
		System.out.println("five");
		System.out.println("six");
		return "from cotroller 1 and test 2 and 3";
	}
}
