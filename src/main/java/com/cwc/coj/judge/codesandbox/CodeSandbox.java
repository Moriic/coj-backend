package com.cwc.coj.judge.codesandbox;

import com.cwc.coj.judge.codesandbox.model.ExecuteCodeRequest;
import com.cwc.coj.judge.codesandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
