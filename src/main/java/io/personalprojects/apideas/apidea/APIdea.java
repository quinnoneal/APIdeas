package io.personalprojects.apideas.apidea;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class APIdea {
    @Id
    private String id;
    private String description;

    public APIdea() {

    }

    public APIdea(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
