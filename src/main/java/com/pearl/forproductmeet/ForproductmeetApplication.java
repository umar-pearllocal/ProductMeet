package com.pearl.forproductmeet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/home")
    public ResponseEntity<?> HomePage() {

        return ResponseEntity.ok("");
    }

}
