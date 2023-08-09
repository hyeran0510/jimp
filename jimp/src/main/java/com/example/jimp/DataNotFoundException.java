package com.example.jimp;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "entity not found") //질문에 데이터가 없을경우 발생
public class DataNotFoundException {
    private static final long serialVersionUID = 1L;  //값을 추가해줬을때 멤버변수를 추가하면 해당데이터는 역직렬화에서 제외-- null값 출력 뭔말임
    public DataNotFoundException(String message) {
        super();
    }
}
