package com.pearl.forproductmeet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ForproductmeetApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForproductmeetApplication.class, args);
	}

    @GetMapping("/")
    public String showPage(@RequestParam(required = false) String name, Model model) {
        model.addAttribute("name", name != null ? name : "Guest");
        return "index";
    }

}
