package com.juzipi.iojbackendjudgeservice.judge;


import com.juzipi.ibackendmodel.entity.QuestionSubmit;

/**
 * @ClassName: JudgeService
 * @Description: 判题服务
 * @Author: 橘子皮
 * @Date: 2024-11-04 20:39
 * @Version: 1.0
 **/
public interface JudgeService {
    /**
     * 判题
     *
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
