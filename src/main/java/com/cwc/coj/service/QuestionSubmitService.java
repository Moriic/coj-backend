package com.cwc.coj.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cwc.coj.controller.QuestionSubmitController;
import com.cwc.coj.model.dto.question.QuestionQueryRequest;
import com.cwc.coj.model.dto.questionSubmit.QuestionSubmitAddRequest;
import com.cwc.coj.model.dto.questionSubmit.QuestionSubmitQueryRequest;
import com.cwc.coj.model.entity.Question;
import com.cwc.coj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cwc.coj.model.entity.User;
import com.cwc.coj.model.vo.QuestionSubmitVO;
import com.cwc.coj.model.vo.QuestionVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author Administrator
* @description 针对表【question_submit(题目提交表)】的数据库操作Service
* @createDate 2023-10-06 22:37:40
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {

    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest 题目提交信息
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);

    /**
     * 获取查询条件
     *
     * @param questionSubmitQueryRequest
     * @return
     */
    QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryRequest questionSubmitQueryRequest);

    /**
     * 获取题目封装
     *
     * @param questionSubmit
     * @param loginUser
     * @return
     */
    QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit questionSubmit, User loginUser);

    /**
     * 分页获取题目封装
     *
     * @param questionSubmitPage
     * @param loginUser
     * @return
     */
    Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionSubmitPage, User loginUser);

}
