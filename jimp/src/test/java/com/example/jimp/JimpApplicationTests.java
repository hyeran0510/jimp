package com.example.jimp;

import Entity.Question;
import Repository.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class JimpApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;


}
