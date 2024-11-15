package com.juzipi.iojbackendjudgeservice.judge.strategy;


import com.juzipi.ibackendmodel.codesandbox.JudgeInfo;

/**
 * @ClassName: JudgeStrategy
 * @Description: 判题策略
 * @Author: 橘子皮
 * @Date: 2024-11-04 21:04
 * @Version: 1.0
 **/
public interface JudgeStrategy {
    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
