package com.example.jimp.answer;


import com.example.jimp.question.Question;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;


@Getter
@Setter
@Entity
@Table
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @ManyToOne // N:1 , Answer 엔티티의 question 속성과 Question 엔티티가 서로 연결
    private Question question;
}
