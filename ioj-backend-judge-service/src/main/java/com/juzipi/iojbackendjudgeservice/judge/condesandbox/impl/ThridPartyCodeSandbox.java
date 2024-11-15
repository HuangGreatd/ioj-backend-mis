package com.juzipi.iojbackendjudgeservice.judge.condesandbox.impl;

import com.juzipi.ibackendmodel.codesandbox.ExecuteCodeRequest;
import com.juzipi.ibackendmodel.codesandbox.ExecuteCodeResponse;
import com.juzipi.iojbackendjudgeservice.judge.condesandbox.CodeSandbox;
import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName: ExampleCodeSandbox
 * @Description: 第三方代码沙箱
 * @Author: 橘子皮
 * @Date: 2024-11-04 15:46
 * @Version: 1.0
 **/
@Slf4j
public class ThridPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        log.info("执行代码请求参数：{}", executeCodeRequest);
        System.out.println("调用第三方代码沙箱");
        return null;
    }
}
