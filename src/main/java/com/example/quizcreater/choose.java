package com.example.quizcreater;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class choose {

    public choose(int id, String choice_body, Boolean iscorrect) {
        this.id = id;
        this.choice_body = choice_body;
        this.iscorrect = iscorrect;
    }

    public choose() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String choice_body;
    private Boolean iscorrect;

    public int getId() {
        return id;
    }

    public String getChoice_body() {
        return choice_body;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setChoice_body(String choice_body) {
        this.choice_body = choice_body;
    }

    public Boolean getIscorrect() {
        return iscorrect;
    }

    public void setIscorrect(Boolean iscorrect) {
        this.iscorrect = iscorrect;
    }
}
