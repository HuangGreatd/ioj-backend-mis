package com.juzipi.iojbackendserviceclient.service;

import com.juzipi.ibackendmodel.entity.Question;

import com.juzipi.ibackendmodel.entity.QuestionSubmit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
* @author 73782
* @description 针对表【question(题目)】的数据库操作Service
* @createDate 2024-11-02 17:50:47
*/
@FeignClient(name = "ioj-backend-question-service", path = "/api/question/inner")
public interface QuestionFeignClient  {
    @GetMapping("/get/id")
    Question getQuestionById(@RequestParam("questionId") long questionId);

    @GetMapping("/question_submit/get/id")
    QuestionSubmit getQuestionSubmitById(@RequestParam("questionId") long questionSubmitId);

    @PostMapping("/question_submit/update")
    boolean updateQuestionSubmitById(@RequestBody QuestionSubmit questionSubmit);

}
