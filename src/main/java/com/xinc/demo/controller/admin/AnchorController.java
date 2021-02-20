package com.xinc.demo.controller.admin;


import com.xinc.demo.common.PagedDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/anchor")
@Api(tags ="主播详情")
public class AnchorController {

    @GetMapping(value = "/anchorListInfo")
    @ApiOperation(value ="/anchorListInfo",notes = "商品榜单接口")
    @ApiImplicitParams({@ApiImplicitParam(name = "AnchorListInfoQuery", value = "内外主播查询参数", paramType = "body", required = true, dataType = "AnchorListInfoQuery") })
    @ResponseBody
    public String anchorListInfo(){
        return "anchorListInfo";
    }


    @GetMapping(value = "/anchorAdd")
    @ApiOperation(value = "添加主播")
    @ResponseBody
    public String anchorAdd(){
        return "anchorAdd";
    }

    @GetMapping(value = "/anchorEdit")
    @ApiOperation(value = "编辑主播")
    @ResponseBody
    public String anchorEdit(){
        return "anchorEdit";
    }

    @GetMapping(value = "/anchorDelelte")
    @ApiOperation(value = "删除主播")

    @ResponseBody
    public String anchorDelelte(){
        return "anchorDelelte";
    }

}

