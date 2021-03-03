package com.xinc.demo.api.query;

import com.xinc.demo.common.PagedParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("后台主播搜索请求参数")
public class AdminAnchorSearchQuery extends PagedParam {

    @ApiModelProperty("主播code，主播ID")
    private String anchorCode;

    @ApiModelProperty("主播昵称。模糊匹配")
    private String userName;

    @ApiModelProperty("主营类目ID")
    private String categoryId;

    @ApiModelProperty("直播平台类型。1: 快手，2: 抖音，3: 淘宝")
    private Integer pType;

    @ApiModelProperty("快手号或用户ID")
    private String pid;

    @ApiModelProperty("抖音号")
    private String dyUniqueId;

    @ApiModelProperty("淘宝逛逛号")
    private String tbGGCode;

    @ApiModelProperty("手机号码。目前仅内部主播有手机号码")
    private String phoneNumber;

    @ApiModelProperty("是否是内部主播。0: 外部主播，1: 内部主播")
    private Integer isInner;
}
