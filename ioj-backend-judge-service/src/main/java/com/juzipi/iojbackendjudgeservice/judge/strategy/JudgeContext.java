package com.juzipi.iojbackendjudgeservice.judge.strategy;
import com.juzipi.ibackendmodel.codesandbox.JudgeInfo;
import com.juzipi.ibackendmodel.dto.question.JudgeCase;
import com.juzipi.ibackendmodel.entity.Question;
import com.juzipi.ibackendmodel.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * @ClassName: JudgeContentext
 * @Description: 上下文（用于定义在策略中传递的参数）
 * @Author: 橘子皮
 * @Date: 2024-11-04 21:05
 * @Version: 1.0
 **/
@Data
public class JudgeContext {
    private JudgeInfo judgeInfo;

    private List<String> inputList;
    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;
}
