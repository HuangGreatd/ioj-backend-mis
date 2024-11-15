package com.juzipi.iojbackendserviceclient.service;


import com.juzipi.ibackendmodel.entity.QuestionSubmit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: JudgeService
 * @Description: 判题服务
 * @Author: 橘子皮
 * @Date: 2024-11-04 20:39
 * @Version: 1.0
 **/
@FeignClient(name = "ioj-backend-judge-service", path = "/api/judge/inner")
public interface JudgeFeignClient {
    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    @PostMapping("/do")
    QuestionSubmit doJudge(@RequestParam("questionSubmitId") long questionSubmitId);

}
