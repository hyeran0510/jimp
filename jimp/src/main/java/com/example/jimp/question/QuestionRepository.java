package com.example.jimp.question;


import com.example.jimp.question.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findBySubject(String subject);
    Question findBySubjectAndContent(String subject, String content);
    List<Question> findBySubjectLike(String subject);

}


    // findAll()
    // SELECT * FROM user;

    // findById()
    // SELECT * FROM user WHERE id = ?;

    // save()
    // INSERT INTO user(username,password,email,createDate) VALUES(?,?,?,?);

    // deleteById()
    // DELETE FROM user WHERE id = ?;

    // update는 영속성 컨텍스트로 사용




