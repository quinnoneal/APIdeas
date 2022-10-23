package io.personalprojects.apideas.apidea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class APIdeaService {

    @Autowired
    private APIdeaRepository apIdeaRepository;

    public List<APIdea> getAllAPIdeas() {
        return apIdeaRepository.findAll();
    }

    public APIdea getAPIdea(String id) {
        return apIdeaRepository.findById(id).get();
    }

    public APIdea getRandomAPIdea() {
        long qty = apIdeaRepository.count();
        int idx = (int)(Math.random() * qty);
        Page<APIdea> apIdeaPage = apIdeaRepository.findAll(PageRequest.of(idx, 1));
        APIdea apIdea = null;
        if (apIdeaPage.hasContent()) {
            apIdea = apIdeaPage.getContent().get(0);
        }
        return apIdea;
    }

    public void addAPIdea(APIdea apIdea) {
        apIdeaRepository.save(apIdea);
    }

    public void updateAPIdea(String id, APIdea apIdea) {
        apIdeaRepository.save(apIdea);
    }

    public void deleteAPIdea(String id) {
        apIdeaRepository.deleteById(id);
    }

}
