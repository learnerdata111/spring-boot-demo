package com.xinc.demo.api.query;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import com.xinc.demo.common.PagedParam;
import java.io.Serializable;
import javax.validation.constraints.NotNull;



@Getter
@Setter
@ApiModel("主播列表请求参数")
public class AnchorListInfoQuery extends PagedParam implements Serializable {
    /**
     * 数据源，是否内外部主播
     */
    @NotNull(message= "是否内外部主播")
        @ApiModelProperty("是否内外部主播，1是 0否")
    private Integer is_inner;
}
