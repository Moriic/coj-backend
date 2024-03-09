package com.cwc.coj.judge;

import com.cwc.coj.model.entity.QuestionSubmit;

public interface JudgeService {

    QuestionSubmit doJudge(long questionSubmitId);
}
