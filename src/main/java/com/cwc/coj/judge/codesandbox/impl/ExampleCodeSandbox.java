package com.cwc.coj.judge.codesandbox.impl;

import com.cwc.coj.judge.codesandbox.CodeSandbox;
import com.cwc.coj.judge.codesandbox.model.ExecuteCodeRequest;
import com.cwc.coj.judge.codesandbox.model.ExecuteCodeResponse;
import com.cwc.coj.judge.codesandbox.model.JudgeInfo;
import com.cwc.coj.model.enums.JudgeInfoMessageEnum;
import com.cwc.coj.model.enums.QuestionSubmitStatusEnum;

import java.util.List;

public class ExampleCodeSandbox implements CodeSandbox {

    /**
     * 示例代码沙箱
     * @param executeCodeRequest
     * @return
     */
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCESS.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}
