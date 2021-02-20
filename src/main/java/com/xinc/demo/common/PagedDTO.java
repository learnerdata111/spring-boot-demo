package com.xinc.demo.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ApiModel("页面返回")
public class PagedDTO<T> implements Serializable {

    private static final long serialVersionUID = -3884577158754259731L;

    @ApiModelProperty(value = "当前页")
    private Long pageNum = 1L;

    @ApiModelProperty(value = "页面大小")
    private Long pageSize = 20L;

    @ApiModelProperty(value = "总记录数")
    private Long totalRecord = 0L;

    @ApiModelProperty(value = "返回结果集")
    private List<T> list;

    public Long getTotalPage() {
        return (totalRecord - 1) / pageSize + 1;
    }
}
