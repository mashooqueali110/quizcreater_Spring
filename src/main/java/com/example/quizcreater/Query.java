package com.example.quizcreater;

import javax.persistence.*;
import java.util.Set;

public class Query {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(columnDefinition="TEXT")
    private String question_body;
    private int points;
    private String type;

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<choose> choose;

    public Query(int id,
                 String question_body,
                 int points,
                 String type,
                 Set<choose> choose) {
        this.id = id;
        this.question_body = question_body;
        this.points = points;
        this.type = type;
        this.choose = choose;
    }

    public Query() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuestion_body(String question_body) {
        this.question_body = question_body;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuestion_body() {
        return question_body;
    }

    public int getPoints() {
        return points;
    }

    public String getType() {
        return type;
    }


}
