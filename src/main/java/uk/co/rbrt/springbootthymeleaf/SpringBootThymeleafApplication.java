package uk.co.rbrt.springbootthymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
@SpringBootApplication
public class SpringBootThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootThymeleafApplication.class, args);
    }

    @GetMapping
    public String home(Model model) {
        model.addAttribute("customers", List.of(
                new Customer(1, LocalDate.of(2024, 1, 10), "Charlotte", true),
                new Customer(2, LocalDate.of(2024, 1, 10), "Thomas", true),
                new Customer(3, LocalDate.of(2024, 1, 12), "Evie", false),
                new Customer(4, LocalDate.of(2024, 1, 14), "Sophia", true),
                new Customer(5, LocalDate.of(2024, 1, 14), "Henry", true)
        ));
        return "index";
    }
    
    record Customer(int id, LocalDate created, String name, boolean active) {}
}
