package Repository;

import Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findBySubject(String subject);

    // findAll()
    // SELECT * FROM user;

    // findById()
    // SELECT * FROM user WHERE id = ?;

    // save()
    // INSERT INTO user(username,password,email,createDate) VALUES(?,?,?,?);

    // deleteById()
    // DELETE FROM user WHERE id = ?;

    // update는 영속성 컨텍스트로 사용

}


