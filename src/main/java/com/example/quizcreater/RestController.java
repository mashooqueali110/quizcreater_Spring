package com.example.quizcreater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class RestController {
    @Autowired
    RepQuiz repQuiz;

    @GetMapping(value = "/getAll")
    public List<Quiz> total_data(){
        return (List<Quiz>) repQuiz.findAll();
    }

    @PostMapping(value = "/addOne")
    public List<Quiz> persist(@RequestBody Quiz quiz){
        repQuiz.save(quiz);
        return (List<Quiz>) repQuiz.findAll();
    }

}
