package com.al.common;

import lombok.Data;

@Data
public class PageRequest  {
    /**
     * 页码，从 1 开始
     */
    private Long current;
    /**
     * 页面大小
     */
    private Long pageSize;
    /**
     * 排序字段
     */
    private String sortField;
    /**
     * 排序顺序（默认：升序）
     */
    private String sortOrder = "asc";
}
