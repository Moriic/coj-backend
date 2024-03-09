package com.cwc.coj.judge.codesandbox.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 判断信息
 */
@Data
public class JudgeInfo {
    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 消耗内容
     */
    private Long memory;

    /**
     * 消耗时间
     */
    private Long time;
}
