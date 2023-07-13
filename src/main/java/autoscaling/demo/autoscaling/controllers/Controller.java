package autoscaling.demo.autoscaling.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v1/sessions")
public class Controller {
	
	public static int opCount;
	@GetMapping
	public String list(){
		return "Triggered";
	}
	@GetMapping("/high")
	public String getHigh() {
		opCount = 10;
		return "Set High triggered";
	}
	@GetMapping("/low")
	public String getLow() {
		opCount = 2;
		return "Set Low triggered";
	}

}
