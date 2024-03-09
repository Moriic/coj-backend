package com.cwc.coj.judge;

import com.cwc.coj.judge.strategy.DefaultJudgeStrategy;
import com.cwc.coj.judge.strategy.JavaLanguageJudgeStrategy;
import com.cwc.coj.judge.strategy.JudgeContext;
import com.cwc.coj.judge.strategy.JudgeStrategy;
import com.cwc.coj.judge.codesandbox.model.JudgeInfo;
import com.cwc.coj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();

        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
