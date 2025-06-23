package kr.manyofactory.manyoshop;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class anyeasulheaController {

    @GetMapping("/anyeasulheaindex")
    public String hello() {

        return "anyeasulheaindex";
    }
}
