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
 * 资源
 * </p>
 *
 * @author qp
 * @since 2020-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SsoResource对象", description="资源")
public class SsoResource implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "上级菜单id,0表示最高级")
    @NotNull(message = "上级菜单不能为空", groups =  AddValidate.class)
    private Integer parentId;

    @ApiModelProperty(value = "资源名称")
    @NotBlank(message = "资源名称不能为空", groups = {UpdateValidate.class, AddValidate.class})
    private String resourceName;

    @ApiModelProperty(value = "资源路径")
    @NotBlank(message = "资源路径不能为空",  groups = {UpdateValidate.class, AddValidate.class})
    private String resourceUrl;

    @ApiModelProperty(value = "资源编码")
    private String resourceCode;

    @ApiModelProperty(value = "资源类型 1.系统 2.模块 3.功能")
    @NotBlank(message = "资源类型不能为空",  groups = {UpdateValidate.class, AddValidate.class})
    private Integer resourceType;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "操作人")
    private String operator;

    @ApiModelProperty(value = "操作人id")
    private Integer operatorId;

    @ApiModelProperty(value = "资源状态 0.删除 1.正常")
    private Integer status;
}
