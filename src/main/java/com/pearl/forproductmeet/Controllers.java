package com.pearl.forproductmeet;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controllers {
    @GetMapping("/")
    public String showPage() {
        return "index";
    }

    @GetMapping("/animate")
    public String animate(@RequestParam(required = false) String name, Model model) {
        model.addAttribute("name", name != null ? name : "Guest");
        return "animated";
    }

    @GetMapping("/home")
    public ResponseEntity<?> HomePage() {

        return ResponseEntity.ok("you found the test page :)");
    }
}
