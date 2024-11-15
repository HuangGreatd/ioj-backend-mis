package com.juzipi.iojbackendjudgeservice.judge.strategy;

import com.juzipi.ibackendmodel.codesandbox.JudgeInfo;
import com.juzipi.ibackendmodel.entity.QuestionSubmit;
import com.juzipi.ibackendmodel.enums.QuestionSubmitLanguageEnum;
import org.springframework.stereotype.Service;

/**
 * @ClassName: JudgeManager
 * @Description: 简化对判题功能的调用，让调用方最简单调用不同的判题策略
 * @Author: 橘子皮
 * @Date: 2024-11-04 21:19
 * @Version: 1.0
 **/
@Service
public class JudgeManager {
    public JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if (QuestionSubmitLanguageEnum.JAVA.getValue().equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
