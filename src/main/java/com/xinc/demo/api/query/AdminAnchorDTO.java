package com.xinc.demo.api.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@ApiModel("后台主播结果")
public class AdminAnchorDTO {

    @ApiModelProperty("主播code")
    private String anchorCode;

    @ApiModelProperty("主播手机号，目前仅内部主播有")
    private String phoneNumber;

    @ApiModelProperty("主播在直播平台用户id")
    private String pid;

    @ApiModelProperty("直播平台类型。1: 快手，2: 抖音，3: 淘宝")
    private Integer pType;

    @ApiModelProperty("是否是内部主播。0: 外部主播，1: 内部主播")
    private Integer isInner;

    @ApiModelProperty("快手平台直播的主播的快手号，部分主播没有快手号")
    private String kwaiId;

    @ApiModelProperty("抖音平台直播的主播的抖音号")
    private String dyUniqueId;

    @ApiModelProperty("淘宝逛逛号")
    private String tbGGCode;

    @ApiModelProperty("淘宝联盟pid，目前仅内部有")
    private String unionId;

    @ApiModelProperty("主播昵称")
    private String userName;

    @ApiModelProperty("头像链接")
    private String headurl;

    @ApiModelProperty("主营类目ID")
    private List<String> categoryIds;

    @ApiModelProperty("主营类目名称")
    private List<String> categoryNames;
}
