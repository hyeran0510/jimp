package com.example.jimp.answer;


import com.example.jimp.question.Question;
import com.example.jimp.question.QuestionController;
import com.example.jimp.question.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/answer")
@RequiredArgsConstructor
@Controller
public class AnswerController {

    private final QuestionService questionService;
    private final AnswerService answerService;

    @PostMapping("/create/{id}")
    public String createAnswer(Model model, @PathVariable("id") Integer id, @RequestParam String content){
        Question question = this.questionService.getQuestion(id); // TODO: 답 저장
        this.answerService.create(question,content);
         return String.format("redirect:/question/detail/%s", id);
    }
}
