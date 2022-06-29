package com.jjw.ecommerce.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * <h1>用户表实体类定义</h1>
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName(value = "t_ecommerce_user")
public class EcommerceUser {

    /** 自增ID */
    @TableId(value = "id" ,type = IdType.AUTO)
    private Long id;

    /**
     * 登录账号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 额外的信息
     */
    @TableField(value = "extra_info")
    private String extraInfo;

    /**
     * 创建时间
     */
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField(value = "update_time",fill = FieldFill.UPDATE)
    private Date updateTime;
}
