package com.example.jimp.Controller;

import java.util.List;

import Entity.Question;
import Repository.QuestionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller

public class QuestionController {

    private final QuestionRepository questionRepository;
    public String list(Model model) {
        List<Question> questionList = this.questionRepository.findAll();
        model.addAttribute("questionList",  questionList);
        return "question_list";
    }
}

