package com.cwc.coj.model.dto.questionSubmit;

import com.baomidou.mybatisplus.annotation.TableField;
import com.cwc.coj.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 题目提交表
 * @TableName question_submit
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class QuestionSubmitQueryRequest extends PageRequest implements Serializable {

    /**
     * 编程语言
     */
    private String language;

    /**
     * 提交状态
     */
    private Integer status;


    /**
     * 题目id
     */
    private Long questionId;

    /**
     * 用户id
     */
    private Long userId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}