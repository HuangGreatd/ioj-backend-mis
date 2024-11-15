package com.juzipi.iojbackendquestionservice.controller.inner;

import com.juzipi.ibackendmodel.entity.Question;
import com.juzipi.ibackendmodel.entity.QuestionSubmit;
import com.juzipi.iojbackendquestionservice.service.QuestionService;
import com.juzipi.iojbackendquestionservice.service.QuestionSubmitService;
import com.juzipi.iojbackendserviceclient.service.QuestionFeignClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName: QuestionInnerController
 * @Description:该服务仅内部调用，不是给前端的
 * @Author: 橘子皮
 * @Date: 2024-11-15 08:36
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/inner")
public class QuestionInnerController implements QuestionFeignClient {

    @Resource
    private QuestionService questionService;

    @Resource
    private QuestionSubmitService questionSubmitService;

    @GetMapping("/get/id")
    @Override
    public Question getQuestionById(@RequestParam("questionId") long questionId) {
        return questionService.getById(questionId);
    }

    @GetMapping("/question_submit/get/id")
    @Override
    public QuestionSubmit getQuestionSubmitById(@RequestParam("questionId") long questionSubmitId) {
        return questionSubmitService.getById(questionSubmitId);
    }

    @PostMapping("/question_submit/update")
    @Override
    public boolean updateQuestionSubmitById(@RequestBody QuestionSubmit questionSubmit) {
        return questionSubmitService.updateById(questionSubmit);
    }
}