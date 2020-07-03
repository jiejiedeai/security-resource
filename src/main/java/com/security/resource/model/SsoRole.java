package com.security.resource.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.security.resource.validate.AddValidate;
import com.security.resource.validate.UpdateValidate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author qp
 * @since 2020-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "SsoRole对象", description = "角色表")
public class SsoRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键添加时不用填")
    @TableId(value = "id", type = IdType.AUTO)
    @NotNull(message = "角色ID不能为空", groups = {UpdateValidate.class})
    private Integer id;

    @ApiModelProperty(value = "角色名称必填")
    @NotBlank(message = "角色名称不能为空", groups = {AddValidate.class})
    private String roleName;

    @ApiModelProperty(value = "角色编码不用填")
    private String roleCode;

    @ApiModelProperty(value = "角色描述选填")
    private String roleDescribe;

    @ApiModelProperty(value = "创建时间不用填")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间不用填")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "操作人不用填")
    private String operator;

    @ApiModelProperty(value = "操作人id不用填")
    private Integer operatorId;

    @ApiModelProperty(value = "状态 0.删除 1.正常不用填")
    private Integer status;

    @ApiModelProperty(value = "公司ID必填")
    @NotNull(message = "公司ID不能为空", groups = {AddValidate.class})
    private Integer companyId;

}
