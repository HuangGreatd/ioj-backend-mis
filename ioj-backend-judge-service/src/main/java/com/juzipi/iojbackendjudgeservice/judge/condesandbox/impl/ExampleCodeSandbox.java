package com.juzipi.iojbackendjudgeservice.judge.condesandbox.impl;

import com.juzipi.ibackendmodel.codesandbox.ExecuteCodeRequest;
import com.juzipi.ibackendmodel.codesandbox.ExecuteCodeResponse;
import com.juzipi.ibackendmodel.codesandbox.JudgeInfo;
import com.juzipi.ibackendmodel.enums.JudgeInfoMessageEnum;
import com.juzipi.ibackendmodel.enums.QuestionSubmitStatusEnum;
import com.juzipi.iojbackendjudgeservice.judge.condesandbox.CodeSandbox;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @ClassName: ExampleCodeSandbox
 * @Description: 示例代码沙箱，（跑通项目流程）
 * @Author: 橘子皮
 * @Date: 2024-11-04 15:46
 * @Version: 1.0
 **/
@Slf4j
public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}
