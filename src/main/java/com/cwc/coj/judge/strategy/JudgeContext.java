package com.cwc.coj.judge.strategy;

import com.cwc.coj.model.dto.question.JudgeCase;
import com.cwc.coj.judge.codesandbox.model.JudgeInfo;
import com.cwc.coj.model.entity.Question;
import com.cwc.coj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 用于定义在策略中传递的参数
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;
}
