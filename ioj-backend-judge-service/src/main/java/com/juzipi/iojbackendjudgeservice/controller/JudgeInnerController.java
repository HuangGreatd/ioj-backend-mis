package com.juzipi.iojbackendjudgeservice.controller;

import com.juzipi.ibackendmodel.entity.QuestionSubmit;
import com.juzipi.iojbackendjudgeservice.judge.JudgeService;
import com.juzipi.iojbackendserviceclient.service.JudgeFeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: JudgeInnerController
 * @Description:该服务仅内部调用，不是给前端的
 * @Author: 橘子皮
 * @Date: 2024-11-15 08:38
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/inner")
public class JudgeInnerController implements JudgeFeignClient {

    @Resource
    private JudgeService judgeService;

    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    @Override
    @PostMapping("/do")
    public QuestionSubmit doJudge(@RequestParam("questionSubmitId") long questionSubmitId){
        return judgeService.doJudge(questionSubmitId);
    }
}

