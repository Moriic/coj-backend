package com.cwc.coj.judge.strategy;

import com.cwc.coj.judge.codesandbox.model.JudgeInfo;

public interface JudgeStrategy {
    JudgeInfo doJudge(JudgeContext judgeContext);
}
