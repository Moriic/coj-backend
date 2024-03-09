package com.cwc.coj.judge.codesandbox;

import com.cwc.coj.judge.codesandbox.model.ExecuteCodeRequest;
import com.cwc.coj.judge.codesandbox.model.ExecuteCodeResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class CodeSandboxProxy implements CodeSandbox {
    private final CodeSandbox codeSandbox;

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        log.info("代码沙箱的请求信息: " + executeCodeRequest.toString());
        ExecuteCodeResponse executeCodeResponse = codeSandbox.executeCode(executeCodeRequest);
        log.info("代码沙箱的返回信息: " + executeCodeResponse.toString());
        return executeCodeResponse;
    }
}
