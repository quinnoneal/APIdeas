package io.personalprojects.apideas.apidea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class APIdeaController {

    @Autowired
    APIdeaService apIdeaService;

    @GetMapping("/apideas")
    public List<APIdea> getAllAPIdeas() {
        return apIdeaService.getAllAPIdeas();
    }

    @GetMapping("/apideas/{id}")
    public APIdea getAPIdea(@PathVariable String id) {
        return apIdeaService.getAPIdea(id);
    }

    @GetMapping("/apideas/random")
    public APIdea getRandomAPIdea() {
        return apIdeaService.getRandomAPIdea();
    }

    @PostMapping("/apideas")
    public void addAPIdea(@RequestBody APIdea apIdea) {
        apIdeaService.addAPIdea(apIdea);
    }

    @PutMapping("/apideas/{id}")
    public void updateAPIdea(@PathVariable String id, @RequestBody APIdea apIdea) {
        apIdeaService.updateAPIdea(id, apIdea);
    }

    @DeleteMapping("/apideas/{id}")
    public void deleteAPIdea(@PathVariable String id) {
        apIdeaService.deleteAPIdea(id);
    }

}
