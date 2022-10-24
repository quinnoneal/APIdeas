package io.personalprojects.apideas.documentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DocumentationController {

    @GetMapping("/")
    public String index() {
        return "documentation";
    }
}
