package com.security.resource.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="", description="资源角色传输对象")
public class SsoResourceRoleDTO {

    @ApiModelProperty(value = "资源id")
    private String resourceId;

    @ApiModelProperty(value = "资源url")
    private String resourceUrl;

    @ApiModelProperty(value = "角色id列表")
    private List<Integer> roleIdList;
}
