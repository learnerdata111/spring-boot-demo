package com.xinc.demo.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@ApiModel(description = "翻页组件")
public class PagedParam implements Serializable {

    private static final long serialVersionUID = -3884577158754259731L;

    @ApiModelProperty(value = "当前页码", example = "1")
    private Long pageNum = 1L;

    @ApiModelProperty(value = "当前页面大小", example = "20")
    private Long pageSize = 20L;
}
