package Entity;


import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.time.LocalDateTime;

@Getter
@Setter

public class Question {

    @id
    private Integer id;
    @Column
    private String subject;
    private String content;
    private LocalDateTime createDate;


}
